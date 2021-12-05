package server;

import client.CBClient;
import client.CBServerClientHeartBeatManager;
import client.ClientTool;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import pojo.CBRecord;
import pojo.CBRecords;
import pool.CBServerClientPool;
import protobuf.CBMessage;
import utils.MysqlWorker;
import utils.RedisWorker;
import utils.ResponseWriter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CBServerHandler extends SimpleChannelInboundHandler<CBMessage.Request> {

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        CBServer.getSingleton().logger.info(String.format("新客户：%s", ctx.channel().id()));
    }

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, CBMessage.Request msg) throws Exception {
        CBServer.getSingleton().logger.info(String.format("message：%s", msg.toString()));
        //System.out.println(msg.toString());
        if (msg.getType() == CBMessage.Type.CONNECT){
            CBClient client = CBServerClientHeartBeatManager.getSingleton().clientHeartBeat(ClientTool.parseIDXtoClientID(0));
            CBServer.getSingleton().logger.debug(String.format("服务器 通道id:%s 用户请求连接，分配的客户端id：%s", ctx.channel().id(), client.client_id));
            client.ctx = ctx;
            client.setState(CBClient.State.CONNECTED);

            CBMessage.ResponseConnect.Builder responseConnect = CBMessage.ResponseConnect.newBuilder();

            CBMessage.Response.Builder responseBuilder = CBMessage.Response.newBuilder();
            responseBuilder.setType(CBMessage.Type.CONNECT);
            responseBuilder.setRequestId(msg.getRequestId());

            responseConnect.setResult(true);
            responseBuilder.setResponseConnect(responseConnect);

            response(client, responseBuilder);

            RedisWorker.getSingleton().updateClient(client);
        }
        else{
            CBClient client = CBServerClientPool.getSingleton().getClientViaID(msg.getClientId());
            switch (msg.getType()){
                case HEARTBEAT:
                    handleHeartbeat(client, msg);
                    break;
                case CREATE_GROUP:
                    handleCreateGroup(client, msg);
                    break;
                case ENTER_GROUP:
                    handleEnterGroup(client, msg);
                    RedisWorker.getSingleton().updateClient(client);
                    break;
                case ADD_ACCOUNT:
                    handleAddAccount(client, msg);
                    break;
                case REMOVE_ACCOUNT:
                    handleRemoveAccount(client, msg);
                    break;
                case GET_ACCOUNTS:
                    handleGetAccounts(client, msg);
                    break;
                case EDIT_NICKNAME:
                    handleEditNickname(client, msg);
                    break;
                case ADD_RECORD:
                    handleAddRecord(client, msg);
                    break;
                case GET_RECORDS:
                    handleGetRecords(client, msg);
                    break;
                case REMOVE_RECORD:
                    handleRemoveRecord(client, msg);
                    break;
                default:
                    break;
            }
        }

    }

    void response(CBClient client, CBMessage.Response.Builder builder){
        if (client == null) {
            return;
        }
        builder.setClientId(client.client_id);
        boolean result = ResponseWriter.writeResponse(client.ctx, builder.build());
        if (!result) CBServer.getSingleton().logger.error("发送消息错误");
    }

    void handleHeartbeat(CBClient client, CBMessage.Request msg){
        CBServerClientHeartBeatManager.getSingleton().clientHeartBeat(client.client_id);
        CBMessage.ResponseHeartbeat.Builder responseHeartbeat = CBMessage.ResponseHeartbeat.newBuilder();
        responseHeartbeat.setResult(true);
        CBMessage.Response.Builder responseBuilder = CBMessage.Response.newBuilder();
        responseBuilder.setType(CBMessage.Type.HEARTBEAT);
        responseBuilder.setTip("pong");
        responseBuilder.setRequestId(msg.getRequestId());
        responseBuilder.setResponseHeartbeat(responseHeartbeat);
        response(client, responseBuilder);
    }

    void handleCreateGroup(CBClient client, CBMessage.Request msg){
        CBMessage.RequestCreateGroup requestCreateGroup = msg.getRequestCreateGroup();
        int DBResult = MysqlWorker.getSingleton().createGroup(
                requestCreateGroup.getGroupname(),
                requestCreateGroup.getAdminUsername(),
                requestCreateGroup.getAdminPassword(),
                requestCreateGroup.getAdminNickname()
        );


        CBMessage.ResponseCreateGroup.Builder responseCreateGroup = CBMessage.ResponseCreateGroup.newBuilder();
        if (DBResult == 0){
            responseCreateGroup.setResult(true);
        }
        else{
            responseCreateGroup.setResult(false).setWords(String.valueOf(DBResult));
        }
        CBMessage.Response.Builder responseBuilder = CBMessage.Response.newBuilder();
        responseBuilder.setType(CBMessage.Type.CREATE_GROUP);
        responseBuilder.setRequestId(msg.getRequestId());
        responseBuilder.setResponseCreateGroup(responseCreateGroup);
        response(client, responseBuilder);
    }

    void handleEnterGroup(CBClient client, CBMessage.Request msg){

        CBMessage.RequestEnterGroup requestEnterGroup = msg.getRequestEnterGroup();
        client.username = requestEnterGroup.getUsername();
        client.groupname = requestEnterGroup.getGroupname();
        int DBResult = MysqlWorker.getSingleton().enterGroup(
                requestEnterGroup.getGroupname(),
                requestEnterGroup.getUsername(),
                requestEnterGroup.getPassword()
        );

        CBMessage.ResponseEnterGroup.Builder responseEnterGroup = CBMessage.ResponseEnterGroup.newBuilder();
        if (DBResult == 0){
            CBClient DBClient = MysqlWorker.getSingleton().getUser(requestEnterGroup.getGroupname(), requestEnterGroup.getUsername());
            if (DBClient.client_id.equals("0")){
                client.authenticated = true;
                client.nickname = DBClient.nickname;
                client.admin = DBClient.admin;
                client.read = DBClient.read;
                client.write = DBClient.write;
                client.setState(CBClient.State.AUTHENTICATED);

                CBMessage.User.Builder user = CBMessage.User.newBuilder();
                user
                        .setGroupname(client.groupname)
                        .setUsername(client.username)
                        .setNickname(client.nickname)
                        .setAdmin(client.admin)
                        .setRead(client.read)
                        .setWrite(client.write);

                responseEnterGroup.setResult(true).setUser(user);
            }
            else{
                responseEnterGroup.setResult(false).setWords("-1");
            }
        }
        else{
            responseEnterGroup.setResult(false).setWords(String.valueOf(DBResult));
        }
        CBMessage.Response.Builder responseBuilder = CBMessage.Response.newBuilder();
        responseBuilder.setType(CBMessage.Type.ENTER_GROUP);
        responseBuilder.setRequestId(msg.getRequestId());
        responseBuilder.setResponseEnterGroup(responseEnterGroup);
        response(client, responseBuilder);
    }

    void handleAddAccount(CBClient client, CBMessage.Request msg){
        CBMessage.RequestAddAccount requestAddAccount = msg.getRequestAddAccount();
        CBClient newClient = new CBClient("-1");
        newClient.groupname = requestAddAccount.getUser().getGroupname();
        newClient.password = requestAddAccount.getUser().getPassword();
        newClient.username = requestAddAccount.getUser().getUsername();
        newClient.nickname = requestAddAccount.getUser().getNickname();
        newClient.admin = requestAddAccount.getUser().getAdmin();
        newClient.read = requestAddAccount.getUser().getRead();
        newClient.write = requestAddAccount.getUser().getWrite();
        int DBResult = MysqlWorker.getSingleton().addAccount(newClient);

        CBMessage.ResponseAddAccount.Builder responseAddAccount = CBMessage.ResponseAddAccount.newBuilder();
        if (DBResult == 0){
            responseAddAccount.setResult(true);
        }
        else{
            responseAddAccount.setResult(false).setWords(String.valueOf(DBResult));
        }
        CBMessage.Response.Builder responseBuilder = CBMessage.Response.newBuilder();
        responseBuilder.setType(CBMessage.Type.ADD_ACCOUNT);
        responseBuilder.setRequestId(msg.getRequestId());
        responseBuilder.setResponseAddAccount(responseAddAccount);
        response(client, responseBuilder);
    }

    void handleRemoveAccount(CBClient client, CBMessage.Request msg){
        CBMessage.RequestRemoveAccount requestRemoveAccount = msg.getRequestRemoveAccount();
        int DBResult = MysqlWorker.getSingleton().removeAccount(requestRemoveAccount.getGroupname(), requestRemoveAccount.getUsername());

        CBMessage.ResponseRemoveAccount.Builder responseRemoveAccount = CBMessage.ResponseRemoveAccount.newBuilder();
        if (DBResult == 0){
            responseRemoveAccount.setResult(true);
        }
        else{
            responseRemoveAccount.setResult(false).setWords(String.valueOf(DBResult));
        }
        CBMessage.Response.Builder responseBuilder = CBMessage.Response.newBuilder();
        responseBuilder.setType(CBMessage.Type.REMOVE_ACCOUNT);
        responseBuilder.setRequestId(msg.getRequestId());
        responseBuilder.setResponseRemoveAccount(responseRemoveAccount);
        response(client, responseBuilder);
    }

    void handleGetAccounts(CBClient client, CBMessage.Request msg){
        CBMessage.RequestGetAccounts requestGetAccounts = msg.getRequestGetAccounts();
        List<CBClient> list = MysqlWorker.getSingleton().getMembersInGroup(requestGetAccounts.getGroupname());



        CBMessage.ResponseGetAccounts.Builder responseGetAccounts = CBMessage.ResponseGetAccounts.newBuilder();

        for (CBClient cbClient : list) {
            CBMessage.User.Builder user = CBMessage.User.newBuilder();
            user
                    .setGroupname(cbClient.groupname)
                    .setUsername(cbClient.username)
                    .setPassword(cbClient.password)
                    .setNickname(cbClient.nickname)
                    .setAdmin(cbClient.admin)
                    .setRead(cbClient.read)
                    .setWrite(cbClient.write);
            responseGetAccounts.addAccounts(user);
        }

        responseGetAccounts.setResult(true);
        CBMessage.Response.Builder responseBuilder = CBMessage.Response.newBuilder();
        responseBuilder.setType(CBMessage.Type.GET_ACCOUNTS);
        responseBuilder.setRequestId(msg.getRequestId());
        responseBuilder.setResponseGetAccounts(responseGetAccounts);
        response(client, responseBuilder);
    }

    void handleEditNickname(CBClient client, CBMessage.Request msg){
        CBMessage.RequestEditNickname requestEditNickname = msg.getRequestEditNickname();
        int DBResult = MysqlWorker.getSingleton().editNickname(requestEditNickname.getGroupname(), requestEditNickname.getUsername(), requestEditNickname.getNickname());

        CBMessage.ResponseEditNickname.Builder responseEditNickname = CBMessage.ResponseEditNickname.newBuilder();
        if (DBResult == 0){
            responseEditNickname.setResult(true).setNickname(requestEditNickname.getNickname());
        }
        else{
            responseEditNickname.setResult(false).setWords(String.valueOf(DBResult));
        }
        CBMessage.Response.Builder responseBuilder = CBMessage.Response.newBuilder();
        responseBuilder.setType(CBMessage.Type.EDIT_NICKNAME);
        responseBuilder.setRequestId(msg.getRequestId());
        responseBuilder.setResponseEditNickname(responseEditNickname);
        response(client, responseBuilder);
    }

    void handleAddRecord(CBClient client, CBMessage.Request msg){
        CBMessage.RequestAddRecord requestAddRecord = msg.getRequestAddRecord();
        CBMessage.Record record = requestAddRecord.getRecord();
        CBRecord cbRecord = new CBRecord();

        cbRecord.groupName = record.getGroupname();
        cbRecord.username = record.getUsername();
        cbRecord.title = record.getTitle();
        cbRecord.comment = record.getComment();
        cbRecord.money = record.getMoney();
        cbRecord.dateTime = record.getDate();

        int DBResult = MysqlWorker.getSingleton().addRecord(cbRecord);

        CBMessage.ResponseAddRecord.Builder responseAddRecord = CBMessage.ResponseAddRecord.newBuilder();
        if (DBResult == 0){
            responseAddRecord.setResult(true);
        }
        else{
            responseAddRecord.setResult(false).setWords(String.valueOf(DBResult));
        }
        CBMessage.Response.Builder responseBuilder = CBMessage.Response.newBuilder();
        responseBuilder.setType(CBMessage.Type.ADD_RECORD);
        responseBuilder.setRequestId(msg.getRequestId());
        responseBuilder.setResponseAddRecord(responseAddRecord);
        response(client, responseBuilder);
    }

    Map<CBMessage.SortType, String> sortTypeStringMap = createSortTypeStringMap();
    private static Map<CBMessage.SortType, String> createSortTypeStringMap() {
        Map<CBMessage.SortType, String> myMap = new HashMap<>();
        myMap.put(CBMessage.SortType.SORT_ID, "record_id");
        myMap.put(CBMessage.SortType.SORT_TITLE, "title");
        myMap.put(CBMessage.SortType.SORT_MONEY, "money");
        myMap.put(CBMessage.SortType.SORT_USERNAME, "username");
        myMap.put(CBMessage.SortType.SORT_DATE, "date_time");
        return myMap;
    }

    Map<CBMessage.SearchType, String> searchTypeStringMap = createSearchTypeStringMap();
    private static Map<CBMessage.SearchType, String> createSearchTypeStringMap() {
        Map<CBMessage.SearchType, String> myMap = new HashMap<>();
        myMap.put(CBMessage.SearchType.SEARCH_ID, "record_id");
        myMap.put(CBMessage.SearchType.SEARCH_TITLE, "title");
        myMap.put(CBMessage.SearchType.SEARCH_MONEY, "money");
        myMap.put(CBMessage.SearchType.SEARCH_USERNAME, "username");
        myMap.put(CBMessage.SearchType.SEARCH_DATE, "date_time");
        return myMap;
    }

    void handleGetRecords(CBClient client, CBMessage.Request msg){
        CBMessage.RequestGetRecords requestGetRecords = msg.getRequestGetRecords();

        CBRecords cbRecords = new CBRecords();
        String sortTypeString = sortTypeStringMap.get(requestGetRecords.getSortType());
        if (requestGetRecords.getSearchTypesCount() == 0){
            cbRecords = MysqlWorker.getSingleton().getRecordsSorted(
                    requestGetRecords.getGroupname(),
                    requestGetRecords.getAscending(),
                    sortTypeString
            );
        }
        else{
            StringBuilder searchStatementBuilder =  new StringBuilder();
            for (int i = 0; i < requestGetRecords.getSearchTypesCount(); i++){

                String temp = "%";
                temp += requestGetRecords.getSearchValues(i);
                temp += "%";
                searchStatementBuilder.append(String.format("%s like '%s'", searchTypeStringMap.get(requestGetRecords.getSearchTypes(i)), temp));

                if (i != requestGetRecords.getSearchTypesCount() - 1) searchStatementBuilder.append(" and ");
            }
            cbRecords = MysqlWorker.getSingleton().getRecordsSortedSearched(
                    requestGetRecords.getGroupname(),
                    requestGetRecords.getAscending(),
                    sortTypeString,
                    searchStatementBuilder.toString()
            );
        }



        CBMessage.ResponseGetRecords.Builder responseGetRecords = CBMessage.ResponseGetRecords.newBuilder();

        for (CBRecord cbRecord : cbRecords.records) {
            CBMessage.Record.Builder record = CBMessage.Record.newBuilder();
            record
                    .setId(cbRecord.id)
                    .setGroupname(cbRecord.groupName)
                    .setUsername(cbRecord.username)
                    .setTitle(cbRecord.title)
                    .setComment(cbRecord.comment)
                    .setMoney(cbRecord.money)
                    .setDate(cbRecord.dateTime);
            responseGetRecords.addRecords(record.build());
        }

        responseGetRecords
                .setAscending(requestGetRecords.getAscending())
                .setGroupname(requestGetRecords.getGroupname())
                .setOnlyCount(requestGetRecords.getOnlyCount())
                .setUsername(requestGetRecords.getUsername())
                .addAllSearchTypes(requestGetRecords.getSearchTypesList())
                .addAllSearchValues(requestGetRecords.getSearchValuesList())
                .setPageIdx(requestGetRecords.getPageIdx())
                .setPageSize(requestGetRecords.getPageSize())
                .setSortType(requestGetRecords.getSortType())
                .setResult(true)
                .setCount(cbRecords.recordsTotalCount);
        CBMessage.Response.Builder responseBuilder = CBMessage.Response.newBuilder();
        responseBuilder.setType(CBMessage.Type.GET_RECORDS);
        responseBuilder.setRequestId(msg.getRequestId());
        responseBuilder.setResponseGetRecords(responseGetRecords);
        response(client, responseBuilder);
    }

    void handleRemoveRecord(CBClient client, CBMessage.Request msg){
        CBMessage.RequestRemoveRecord requestRemoveRecord = msg.getRequestRemoveRecord();
        int DBResult = MysqlWorker.getSingleton().removeRecord(requestRemoveRecord.getGroupname(), requestRemoveRecord.getRecordId());

        CBMessage.ResponseRemoveRecord.Builder responseRemoveRecord = CBMessage.ResponseRemoveRecord.newBuilder();
        if (DBResult == 0){
            responseRemoveRecord.setResult(true);
        }
        else{
            responseRemoveRecord.setResult(false).setWords(String.valueOf(DBResult));
        }
        CBMessage.Response.Builder responseBuilder = CBMessage.Response.newBuilder();
        responseBuilder.setType(CBMessage.Type.REMOVE_RECORD);
        responseBuilder.setRequestId(msg.getRequestId());
        responseBuilder.setResponseRemoveRecord(responseRemoveRecord);
        response(client, responseBuilder);
    }

}
