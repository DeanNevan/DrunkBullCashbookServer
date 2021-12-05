package utils;

import client.CBClient;
import pojo.CBRecord;
import pojo.CBRecords;
import utils.connection.MysqlConnection;

import java.sql.Date;
import java.util.*;
import java.sql.*;

public class MysqlWorker {

    private volatile static MysqlWorker singleton;
    public static MysqlWorker getSingleton() {
        if (singleton == null) {
            synchronized (MysqlWorker.class) {
                if (singleton == null) {
                    singleton = new MysqlWorker();
                }
            }
        }
        return singleton;
    }

    MysqlConnection mysqlConnection;
    Statement statement;

    private MysqlWorker(){
        mysqlConnection = MysqlConnection.getSingleton();
        try {
            statement = mysqlConnection.getConnection().createStatement();
            statement.executeUpdate("USE drunkbull_cashbook");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public int createGroup(String groupname, String adminUsername, String adminPassword, String adminNickname){
        int result = -1;
        try {
            String sql = "select group_id from cbgroups where groupname = (?)";
            PreparedStatement pstat = mysqlConnection.getConnection().prepareStatement(sql);
            pstat.setString(1, groupname);

            int count = 0;
            ResultSet rs = pstat.executeQuery();
            // 展开结果集数据库
            while(rs.next()){
                count += 1;
            }
            if (count != 0) result = 1;
            else{
                String sql2 = "insert into cbgroups (groupname, admin_username) values (?, ?)";
                pstat = mysqlConnection.connection.prepareStatement(sql2);
                pstat.setString(1, groupname);
                pstat.setString(2, adminUsername);
                int err = pstat.executeUpdate();
                if (err != 1) result = 2;
                else{
                    sql = "CREATE TABLE IF NOT EXISTS %s_members(" +
                            "member_id int auto_increment," +
                            "member_username varchar(255) not null," +
                            "member_password varchar(255) not null," +
                            "member_nickname varchar(255) not null," +
                            "authority_admin tinyint not null," +
                            "authority_read tinyint not null," +
                            "authority_write tinyint not null," +
                            "member_date DATE," +
                            "primary key (member_id))ENGINE=InnoDB DEFAULT CHARSET=utf8;";
                    sql = String.format(sql, groupname);
                    pstat = mysqlConnection.connection.prepareStatement(sql);
                    err = pstat.executeUpdate(sql);
                    if (err != 0) result = 3;
                    else{

                        sql = "CREATE TABLE IF NOT EXISTS %s_records(" +
                                "record_id int auto_increment," +
                                "username varchar(255) not null," +
                                "title varchar(255) not null," +
                                "comment text not null," +
                                "money double not null," +
                                "date_time date not null," +
                                "primary key (record_id))ENGINE=InnoDB DEFAULT CHARSET=utf8;";
                        sql = String.format(sql, groupname);
                        pstat = mysqlConnection.connection.prepareStatement(sql);
                        err = pstat.executeUpdate(sql);
                        if (err != 0) result = 4;
                        else{
                            String sql3 = "insert into %s_members (member_username, member_password, member_nickname, authority_admin, authority_read, authority_write, member_date) values (?, ?, ?, ?, ?, ?, CURRENT_TIME())";
                            sql3 = String.format(sql3, groupname);
                            pstat = mysqlConnection.connection.prepareStatement(sql3);
                            pstat.setString(1, adminUsername);
                            pstat.setString(2, adminPassword);
                            pstat.setString(3, adminNickname);
                            pstat.setInt(4, 1);
                            pstat.setInt(5, 1);
                            pstat.setInt(6, 1);
                            err = pstat.executeUpdate();
                            if (err != 1) result = 5;
                            else result = 0;
                        }
                    }
                }
            }
            //完成后关闭
            pstat.close();
            rs.close();

        } catch (SQLException e){
            System.err.println(e);
        }
        return result;
    }

    public int enterGroup(String groupName, String username, String password){
        int result = -1;
        try {
            String sql = "select group_id from cbgroups where groupname = (?)";
            PreparedStatement pstat = mysqlConnection.getConnection().prepareStatement(sql);
            pstat.setString(1, groupName);

            int count = 0;
            ResultSet rs = pstat.executeQuery();
            // 展开结果集数据库
            while(rs.next()){
                count += 1;
            }
            if (count == 0) result = 1;
            else{
                sql = "select member_password from %s_members where member_username = (?)";
                sql = String.format(sql, groupName);
                pstat = mysqlConnection.getConnection().prepareStatement(sql);
                pstat.setString(1, username);
                rs = pstat.executeQuery();
                String DBPassword = "";
                while(rs.next()){
                    DBPassword = rs.getString("member_password");
                    break;
                }
                if (DBPassword.equals("")) result = 2;
                else{
                    if (DBPassword.equals(password)) result = 0;
                    else result = 3;
                }
            }
            //完成后关闭
            pstat.close();
            rs.close();

        } catch (SQLException e){
            System.err.println(e);
        }
        return result;
    }

    public CBClient getUser(String groupName, String username){
        CBClient client = new CBClient("-1");
        try {
            String sql = "select group_id from cbgroups where groupname = (?)";
            PreparedStatement pstat = mysqlConnection.getConnection().prepareStatement(sql);
            pstat.setString(1, groupName);

            int count = 0;
            ResultSet rs = pstat.executeQuery();
            // 展开结果集数据库
            while(rs.next()){
                count += 1;
            }
            if (count != 0){
                sql = "select member_nickname,authority_admin,authority_read,authority_write from %s_members where member_username = (?)";
                sql = String.format(sql, groupName);
                pstat = mysqlConnection.getConnection().prepareStatement(sql);
                pstat.setString(1, username);
                rs = pstat.executeQuery();
                // 展开结果集数据库
                String DBPassword = "";
                while (rs.next()){
                    client.nickname = rs.getString("member_nickname");
                    client.admin = rs.getInt("authority_admin") != 0;
                    client.read = rs.getInt("authority_read")  != 0;
                    client.write = rs.getInt("authority_write")  != 0;
                    client.client_id = "0";
                    break;
                }
            }


            //完成后关闭
            pstat.close();
            rs.close();

        } catch (SQLException e){
            System.err.println(e);
        }
        return client;
    }

    public int addAccount(CBClient client){
        int result = -1;
        try {
            String sql = "select group_id from cbgroups where groupname = (?)";
            PreparedStatement pstat = mysqlConnection.getConnection().prepareStatement(sql);
            pstat.setString(1, client.groupname);

            int count = 0;
            ResultSet rs = pstat.executeQuery();
            // 展开结果集数据库
            while(rs.next()){
                count += 1;
            }
            if (count == 0) result = 1;
            else{
                String sql2 = "select member_id from %s_members where member_username = (?)";
                sql2 = String.format(sql2, client.groupname);
                pstat = mysqlConnection.connection.prepareStatement(sql2);
                pstat.setString(1, client.username);
                count = 0;
                rs = pstat.executeQuery();
                // 展开结果集数据库
                while(rs.next()){
                    count += 1;
                }
                if (count != 0) result = 2;
                else{
                    String sql3 = "insert into %s_members (member_username, member_password, member_nickname, authority_admin, authority_read, authority_write, member_date) values (?, ?, ?, ?, ?, ?, CURRENT_TIME())";
                    sql3 = String.format(sql3, client.groupname);
                    pstat = mysqlConnection.connection.prepareStatement(sql3);
                    pstat.setString(1, client.username);
                    pstat.setString(2, client.password);
                    pstat.setString(3, client.nickname);
                    pstat.setInt(4, client.admin ? 1 : 0);
                    pstat.setInt(5, client.read ? 1 : 0);
                    pstat.setInt(6, client.write ? 1 : 0);
                    int err = pstat.executeUpdate();
                    if (err != 1) result = 3;
                    else result = 0;
                }
            }
            //完成后关闭
            pstat.close();
            rs.close();

        } catch (SQLException e){
            System.err.println(e);
        }
        return result;
    }

    public int removeAccount(String groupname, String username){
        int result = -1;
        try {
            String sql = "select group_id from cbgroups where groupname = (?)";
            PreparedStatement pstat = mysqlConnection.getConnection().prepareStatement(sql);
            pstat.setString(1, groupname);

            int count = 0;
            ResultSet rs = pstat.executeQuery();
            // 展开结果集数据库
            while(rs.next()){
                count += 1;
            }
            if (count == 0) result = 1;
            else{
                String sql2 = "select member_id from %s_members where member_username = (?)";
                sql2 = String.format(sql2, groupname);
                pstat = mysqlConnection.connection.prepareStatement(sql2);
                pstat.setString(1, username);
                count = 0;
                rs = pstat.executeQuery();
                // 展开结果集数据库
                while(rs.next()){
                    count += 1;
                }
                if (count == 0) result = 2;
                else{
                    String sql3 = "delete from %s_members where member_username = (?)";
                    sql3 = String.format(sql3, groupname);
                    pstat = mysqlConnection.connection.prepareStatement(sql3);
                    pstat.setString(1, username);
                    int err = pstat.executeUpdate();
                    if (err != 1) result = 3;
                    else result = 0;
                }
            }
            //完成后关闭
            pstat.close();
            rs.close();

        } catch (SQLException e){
            System.err.println(e);
        }
        return result;
    }

    public List<CBClient> getMembersInGroup(String groupname){
        List<CBClient> list = new ArrayList<>();
        try {
            String sql = "select group_id from cbgroups where groupname = (?)";
            PreparedStatement pstat = mysqlConnection.getConnection().prepareStatement(sql);
            pstat.setString(1, groupname);

            int count = 0;
            ResultSet rs = pstat.executeQuery();
            // 展开结果集数据库
            while(rs.next()){
                count += 1;
            }
            if (count != 0) {
                String sql2 = "select member_username, member_password, member_nickname, authority_admin, authority_read, authority_write from %s_members";
                sql2 = String.format(sql2, groupname);
                pstat = mysqlConnection.connection.prepareStatement(sql2);
                count = 0;
                rs = pstat.executeQuery();
                // 展开结果集数据库
                while(rs.next()){
                    CBClient client = new CBClient("-1");
                    client.groupname = groupname;
                    client.username = rs.getString("member_username");
                    client.password = rs.getString("member_password");
                    client.nickname = rs.getString("member_nickname");
                    client.admin = rs.getInt("authority_admin") != 0;
                    client.read = rs.getInt("authority_read")  != 0;
                    client.write = rs.getInt("authority_write")  != 0;
                    list.add(client);
                }
            }
            //完成后关闭
            pstat.close();
            rs.close();

        } catch (SQLException e){
            System.err.println(e);
        }
        return list;
    }

    public int editNickname(String groupname, String username, String nickname){
        int result = -1;
        try {
            String sql = "select group_id from cbgroups where groupname = (?)";
            PreparedStatement pstat = mysqlConnection.getConnection().prepareStatement(sql);
            pstat.setString(1, groupname);

            int count = 0;
            ResultSet rs = pstat.executeQuery();
            // 展开结果集数据库
            while(rs.next()){
                count += 1;
            }
            if (count == 0) result = 1;
            else{
                String sql2 = "select member_id from %s_members where member_username = (?)";
                sql2 = String.format(sql2, groupname);
                pstat = mysqlConnection.connection.prepareStatement(sql2);
                pstat.setString(1, username);
                count = 0;
                rs = pstat.executeQuery();
                // 展开结果集数据库
                while(rs.next()){
                    count += 1;
                }
                if (count == 0) result = 2;
                else{
                    String sql3 = "update %s_members set member_nickname=? where member_username = (?)";
                    sql3 = String.format(sql3, groupname);
                    pstat = mysqlConnection.connection.prepareStatement(sql3);
                    pstat.setString(1, nickname);
                    pstat.setString(2, username);
                    int err = pstat.executeUpdate();
                    if (err != 1) result = 3;
                    else result = 0;
                }
            }
            //完成后关闭
            pstat.close();
            rs.close();

        } catch (SQLException e){
            System.err.println(e);
        }
        return result;
    }

    public int addRecord(CBRecord cbRecord){
        int result = -1;
        try {
            String sql = "select group_id from cbgroups where groupname = (?)";
            PreparedStatement pstat = mysqlConnection.getConnection().prepareStatement(sql);
            pstat.setString(1, cbRecord.groupName);

            int count = 0;
            ResultSet rs = pstat.executeQuery();
            // 展开结果集数据库
            while(rs.next()){
                count += 1;
            }
            if (count == 0) result = 1;
            else{
                String sql2 = "insert into %s_records (username, title, comment, money, date_time) values (?, ?, ?, ?, ?)";
                sql2 = String.format(sql2, cbRecord.groupName);
                pstat = mysqlConnection.connection.prepareStatement(sql2);
                pstat.setString(1, cbRecord.username);
                pstat.setString(2, cbRecord.title);
                pstat.setString(3, cbRecord.comment);
                pstat.setDouble(4, cbRecord.money);
                Date date = new Date(cbRecord.dateTime * 1000);
                pstat.setDate(5, date);
                int err = pstat.executeUpdate();
                if (err != 1) result = 2;
                else result = 0;
            }
            //完成后关闭
            pstat.close();
            rs.close();

        } catch (SQLException e){
            System.err.println(e);
        }
        return result;
    }

    public CBRecords getRecords(
            String groupname
    ){
        CBRecords cbRecords = new CBRecords();
        try {
            String sql = "select group_id from cbgroups where groupname = (?)";
            PreparedStatement pstat = mysqlConnection.getConnection().prepareStatement(sql);
            pstat.setString(1, groupname);

            int count = 0;
            ResultSet rs = pstat.executeQuery();
            // 展开结果集数据库
            while(rs.next()){
                count += 1;
            }
            if (count != 0) {
                String sql2 = "select record_id, username, title, comment, money, date_time from %s_records";
                sql2 = String.format(sql2, groupname);
                pstat = mysqlConnection.connection.prepareStatement(sql2);
                rs = pstat.executeQuery();
                // 展开结果集数据库
                while(rs.next()){
                    CBRecord cbRecord = new CBRecord();
                    cbRecord.id = rs.getInt("record_id");
                    cbRecord.username = rs.getString("username");
                    cbRecord.title = rs.getString("title");
                    cbRecord.comment = rs.getString("comment");
                    cbRecord.money = rs.getDouble("money");
                    Date date = rs.getDate("date_time");
                    cbRecord.dateTime = date.getTime();
                    cbRecords.records.add(cbRecord);
                }
            }

            String sqlCount = "select count(*) from %s_records";
            sqlCount = String.format(sqlCount, groupname);
            pstat = mysqlConnection.connection.prepareStatement(sqlCount);
            rs = pstat.executeQuery();
            if (rs.next()) cbRecords.recordsTotalCount = rs.getInt(1);

            //完成后关闭
            pstat.close();
            rs.close();

        } catch (SQLException e){
            System.err.println(e);
        }
        return cbRecords;
    }

    public CBRecords getRecordsLimit(
            String groupname,
            int pageSize,
            int pageIDX
    ){
        CBRecords cbRecords = new CBRecords();
        try {
            String sql = "select group_id from cbgroups where groupname = (?)";
            PreparedStatement pstat = mysqlConnection.getConnection().prepareStatement(sql);
            pstat.setString(1, groupname);

            int count = 0;
            ResultSet rs = pstat.executeQuery();
            // 展开结果集数据库
            while(rs.next()){
                count += 1;
            }
            if (count != 0) {
                String sql2 = "select record_id, username, title, comment, money, date_time from %s_records limit %d, %d";
                sql2 = String.format(sql2, groupname, pageIDX * pageSize, pageSize);
                pstat = mysqlConnection.connection.prepareStatement(sql2);
                rs = pstat.executeQuery();
                // 展开结果集数据库
                while(rs.next()){
                    CBRecord cbRecord = new CBRecord();
                    cbRecord.id = rs.getInt("record_id");
                    cbRecord.username = rs.getString("username");
                    cbRecord.title = rs.getString("title");
                    cbRecord.comment = rs.getString("comment");
                    cbRecord.money = rs.getDouble("money");
                    Date date = rs.getDate("date_time");
                    cbRecord.dateTime = date.getTime();
                    cbRecords.records.add(cbRecord);
                }
            }

            String sqlCount = "select count(*) from %s_records";
            sqlCount = String.format(sqlCount, groupname);
            pstat = mysqlConnection.connection.prepareStatement(sqlCount);
            rs = pstat.executeQuery();
            if (rs.next()) cbRecords.recordsTotalCount = rs.getInt(1);

            //完成后关闭
            pstat.close();
            rs.close();

        } catch (SQLException e){
            System.err.println(e);
        }
        return cbRecords;
    }

    public CBRecords getRecordsLimitSorted(
            String groupname,
            int pageSize,
            int pageIDX,
            boolean asc,
            String sortBy
    ){
        CBRecords cbRecords = new CBRecords();
        try {
            String sql = "select group_id from cbgroups where groupname = (?)";
            PreparedStatement pstat = mysqlConnection.getConnection().prepareStatement(sql);
            pstat.setString(1, groupname);

            int count = 0;
            ResultSet rs = pstat.executeQuery();
            // 展开结果集数据库
            while(rs.next()){
                count += 1;
            }
            if (count != 0) {
                String sql2 = "select record_id, username, title, comment, money, date_time from %s_records order by %s %s limit %d, %d";
                sql2 = String.format(sql2, groupname, sortBy, asc ? "ASC" : "DESC" , pageIDX * pageSize, pageSize);
                pstat = mysqlConnection.connection.prepareStatement(sql2);
                rs = pstat.executeQuery();
                // 展开结果集数据库
                while(rs.next()){
                    CBRecord cbRecord = new CBRecord();
                    cbRecord.id = rs.getInt("record_id");
                    cbRecord.username = rs.getString("username");
                    cbRecord.title = rs.getString("title");
                    cbRecord.comment = rs.getString("comment");
                    cbRecord.money = rs.getDouble("money");
                    Date date = rs.getDate("date_time");
                    cbRecord.dateTime = date.getTime();
                    cbRecords.records.add(cbRecord);
                }
            }

            String sqlCount = "select count(*) from %s_records";
            sqlCount = String.format(sqlCount, groupname);
            pstat = mysqlConnection.connection.prepareStatement(sqlCount);
            rs = pstat.executeQuery();
            if (rs.next()) cbRecords.recordsTotalCount = rs.getInt(1);

            //完成后关闭
            pstat.close();
            rs.close();

        } catch (SQLException e){
            System.err.println(e);
        }
        return cbRecords;
    }

    public CBRecords getRecordsSorted(
            String groupname,
            boolean asc,
            String sortBy
    ){
        CBRecords cbRecords = new CBRecords();
        try {
            String sql = "select group_id from cbgroups where groupname = (?)";
            PreparedStatement pstat = mysqlConnection.getConnection().prepareStatement(sql);
            pstat.setString(1, groupname);

            int count = 0;
            ResultSet rs = pstat.executeQuery();
            // 展开结果集数据库
            while(rs.next()){
                count += 1;
            }
            if (count != 0) {
                String sql2 = "select record_id, username, title, comment, money, date_time from %s_records order by %s %s";
                sql2 = String.format(sql2, groupname, sortBy, asc ? "ASC" : "DESC");
                pstat = mysqlConnection.connection.prepareStatement(sql2);
                rs = pstat.executeQuery();
                // 展开结果集数据库
                while(rs.next()){
                    CBRecord cbRecord = new CBRecord();
                    cbRecord.id = rs.getInt("record_id");
                    cbRecord.username = rs.getString("username");
                    cbRecord.title = rs.getString("title");
                    cbRecord.comment = rs.getString("comment");
                    cbRecord.money = rs.getDouble("money");
                    Date date = rs.getDate("date_time");
                    cbRecord.dateTime = date.getTime();
                    cbRecords.records.add(cbRecord);
                }
            }

            String sqlCount = "select count(*) from %s_records";
            sqlCount = String.format(sqlCount, groupname);
            pstat = mysqlConnection.connection.prepareStatement(sqlCount);
            rs = pstat.executeQuery();
            if (rs.next()) cbRecords.recordsTotalCount = rs.getInt(1);

            //完成后关闭
            pstat.close();
            rs.close();

        } catch (SQLException e){
            System.err.println(e);
        }
        return cbRecords;
    }

    public CBRecords getRecordsLimitSortedSearched(
            String groupname,
            int pageSize,
            int pageIDX,
            boolean asc,
            String sortBy,
            String searchStatement
    ){
        CBRecords cbRecords = new CBRecords();
        try {
            String sql = "select group_id from cbgroups where groupname = (?)";
            PreparedStatement pstat = mysqlConnection.getConnection().prepareStatement(sql);
            pstat.setString(1, groupname);

            int count = 0;
            ResultSet rs = pstat.executeQuery();
            // 展开结果集数据库
            while(rs.next()){
                count += 1;
            }
            if (count != 0) {
                String sql2 = "select record_id, username, title, comment, money, date_time from %s_records where %s order by %s %s limit %d, %d";
                sql2 = String.format(sql2, groupname, searchStatement, sortBy, asc ? "ASC" : "DESC" , pageIDX * pageSize, pageSize);
                pstat = mysqlConnection.connection.prepareStatement(sql2);
                rs = pstat.executeQuery();
                // 展开结果集数据库
                while(rs.next()){
                    CBRecord cbRecord = new CBRecord();
                    cbRecord.id = rs.getInt("record_id");
                    cbRecord.username = rs.getString("username");
                    cbRecord.title = rs.getString("title");
                    cbRecord.comment = rs.getString("comment");
                    cbRecord.money = rs.getDouble("money");
                    Date date = rs.getDate("date_time");
                    cbRecord.dateTime = date.getTime();
                    cbRecords.records.add(cbRecord);
                }
            }

            String sqlCount = "select count(*) from %s_records where %s";
            sqlCount = String.format(sqlCount, groupname, searchStatement);
            pstat = mysqlConnection.connection.prepareStatement(sqlCount);
            rs = pstat.executeQuery();
            if (rs.next()) cbRecords.recordsTotalCount = rs.getInt(1);

            //完成后关闭
            pstat.close();
            rs.close();

        } catch (SQLException e){
            System.err.println(e);
        }
        return cbRecords;
    }

    public CBRecords getRecordsSortedSearched(
            String groupname,
            boolean asc,
            String sortBy,
            String searchStatement
    ){
        CBRecords cbRecords = new CBRecords();
        try {
            String sql = "select group_id from cbgroups where groupname = (?)";
            PreparedStatement pstat = mysqlConnection.getConnection().prepareStatement(sql);
            pstat.setString(1, groupname);

            int count = 0;
            ResultSet rs = pstat.executeQuery();
            // 展开结果集数据库
            while(rs.next()){
                count += 1;
            }
            if (count != 0) {
                String sql2 = "select record_id, username, title, comment, money, date_time from %s_records where %s order by %s %s";
                sql2 = String.format(sql2, groupname, searchStatement, sortBy, asc ? "ASC" : "DESC");
                pstat = mysqlConnection.connection.prepareStatement(sql2);
                rs = pstat.executeQuery();
                // 展开结果集数据库
                while(rs.next()){
                    CBRecord cbRecord = new CBRecord();
                    cbRecord.id = rs.getInt("record_id");
                    cbRecord.username = rs.getString("username");
                    cbRecord.title = rs.getString("title");
                    cbRecord.comment = rs.getString("comment");
                    cbRecord.money = rs.getDouble("money");
                    Date date = rs.getDate("date_time");
                    cbRecord.dateTime = date.getTime();
                    cbRecords.records.add(cbRecord);
                }
            }

            cbRecords.recordsTotalCount = cbRecords.records.size();

            //完成后关闭
            pstat.close();
            rs.close();

        } catch (SQLException e){
            System.err.println(e);
        }
        return cbRecords;
    }

    public int removeRecord(String groupname, int recordID){
        int result = -1;
        try {
            String sql = "select group_id from cbgroups where groupname = (?)";
            PreparedStatement pstat = mysqlConnection.getConnection().prepareStatement(sql);
            pstat.setString(1, groupname);

            int count = 0;
            ResultSet rs = pstat.executeQuery();
            // 展开结果集数据库
            while(rs.next()){
                count += 1;
            }
            if (count == 0) result = 1;
            else{
                String sql2 = "select record_id from %s_records where record_id = (?)";
                sql2 = String.format(sql2, groupname);
                pstat = mysqlConnection.connection.prepareStatement(sql2);
                pstat.setInt(1, recordID);
                count = 0;
                rs = pstat.executeQuery();
                // 展开结果集数据库
                while(rs.next()){
                    count += 1;
                }
                if (count == 0) result = 2;
                else{
                    String sql3 = "delete from %s_records where record_id = (?)";
                    sql3 = String.format(sql3, groupname);
                    pstat = mysqlConnection.connection.prepareStatement(sql3);
                    pstat.setInt(1, recordID);
                    int err = pstat.executeUpdate();
                    if (err != 1) result = 3;
                    else result = 0;
                }
            }
            //完成后关闭
            pstat.close();
            rs.close();

        } catch (SQLException e){
            System.err.println(e);
        }
        return result;
    }


}
