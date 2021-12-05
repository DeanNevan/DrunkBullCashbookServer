package client;

import pool.CBServerClientIDXPool;
import pool.CBServerClientPool;
import server.CBServer;
import utils.data.DateUtil;

import java.util.*;

public class CBServerClientHeartBeatManager {
    static final int MAX_TIMEOUT_SECONDS = 20;
    static final int MONITOR_SLEEP_TIME = 1000;

    private volatile static CBServerClientHeartBeatManager singleton;
    public static CBServerClientHeartBeatManager getSingleton() {
        if (singleton == null) {
            synchronized (CBServerClientHeartBeatManager.class) {
                if (singleton == null) {
                    singleton = new CBServerClientHeartBeatManager();
                }
            }
        }
        return singleton;
    }

    private static void clientHeartBeatTimeout(String id){
        CBServer.getSingleton().logger.debug(String.format("客户端实体id：%s 客户端实体心跳超时", id));
        heartBeats.remove(id);
        CBServerClientPool.getSingleton().removeClientViaID(id);
    }

    private static HashMap<String, Integer> heartBeats = new HashMap<>();

    public CBClient newClient(){
        return CBServerClientPool.getSingleton().addClient();
    }

    public CBClient clientHeartBeat(String id){
        int idx = ClientTool.parseClientIDtoIDX(id);

        CBClient n;
        if (idx < CBServerClientIDXPool.MIN){
            n = newClient();
            heartBeats.put(n.client_id, DateUtil.getSecondTimestamp(new Date()));
            return n;
        }
        n = CBServerClientPool.getSingleton().getClientViaID(id);
        if (n == null){
            n = CBServerClientPool.getSingleton().addClient();
        }
        heartBeats.put(n.client_id, DateUtil.getSecondTimestamp(new Date()));
        return n;
    }

    public void activeMonitor(){
        threadHeatBeatsMonitor.active = true;
    }

    public void inactiveMonitor(){
        threadHeatBeatsMonitor.active = false;
    }

    public void startMonitor(){
        activeMonitor();
        threadHeatBeatsMonitor.start();
    }

    public void stopMonitor(){
        inactiveMonitor();
        threadHeatBeatsMonitor.interrupt();
    }

    private ThreadHeatBeatsMonitor threadHeatBeatsMonitor = new ThreadHeatBeatsMonitor();



    static class ThreadHeatBeatsMonitor extends Thread {
        boolean active = false;
        boolean stopFlag = false;
        public void run() {
            while (!stopFlag){
                try {
                    sleep(MONITOR_SLEEP_TIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (!active) continue;
                int currentTimeStampSecond = DateUtil.getSecondTimestamp(new Date());
                //System.out.println("currentTimeStampSecond:" + currentTimeStampSecond);
                Iterator iter = heartBeats.entrySet().iterator();
                Vector<String> timeoutKeys = new Vector<>();
                while (iter.hasNext()) {
                    Map.Entry entry = (Map.Entry) iter.next();
                    String key = (String) entry.getKey();
                    int lastTimeSecond = (int) entry.getValue();
                    int timeInterval = currentTimeStampSecond - lastTimeSecond;
//                    System.out.println("key:" + key);
//                    System.out.println("timeInterval:" + timeInterval);
//                    System.out.println();
                    if (timeInterval > MAX_TIMEOUT_SECONDS){
                        timeoutKeys.add(key);
                        //clientHeartBeatTimeout(key);
                    }
                }
                iter = timeoutKeys.iterator();
                while (iter.hasNext()) {
                    String id = (String) iter.next();
                    clientHeartBeatTimeout(id);
                }
            }
        }
        public void willStop(){
            stopFlag = true;
        }
    }
}
