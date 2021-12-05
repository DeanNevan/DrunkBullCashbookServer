package pool;


import client.CBClient;
import client.ClientTool;
import server.CBServer;
import utils.RedisWorker;

import java.util.HashMap;

public class CBServerClientPool {
    private volatile static CBServerClientPool singleton;
    public static CBServerClientPool getSingleton() {
        if (singleton == null) {
            synchronized (CBServerClientPool.class) {
                if (singleton == null) {
                    singleton = new CBServerClientPool();
                }
            }
        }
        return singleton;
    }

    public CBServer server;

    public void init(CBServer server){
        this.server = server;
        server.logger.debug(String.format("服务器 客户端实体ID池初始化"));
    }

    private static HashMap<String, CBClient> clients = new HashMap<>();

    public CBClient getClientViaID(String id){
        return clients.get(id);
    }

    public CBClient addClient(){
        int idx = CBServerClientIDXPool.getSingleton().getId();
        CBClient gateServerClient = new CBClient(ClientTool.parseIDXtoClientID(idx));
        clients.put(gateServerClient.client_id, gateServerClient);

        return gateServerClient;
    }

    public HashMap<String, CBClient> getClients() {
        return clients;
    }

    public void removeClientViaID(String id){
        CBClient n = getClientViaID(id);
        if (n == null){
            return;
        }
        clients.remove(id);
        int idx = ClientTool.parseClientIDtoIDX(id);
        CBServerClientIDXPool.getSingleton().freeId(idx);

        RedisWorker.getSingleton().removeClientViaID(id);
    }

    public int getClientsSize(){
        return clients.size();
    }
}
