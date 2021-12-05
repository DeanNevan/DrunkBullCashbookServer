public class HeartBeatManager {
    public void sendRequestHeartBeat(){
        CBMessage.Request.Builder requestBuilder = CBMessage.Request.newBuilder();
        requestBuilder
                .setTip("ping")
                .setType(CBMessage.Type.HEARTBEAT);
        ServerConnection.getSingleton().sendRequest(requestBuilder);
    }

    static final int MAX_TIMEOUT_SECONDS = 30000;
    static final int SLEEP_TIME = 2000;

    private volatile static HeartBeatManager singleton;
    public static HeartBeatManager getSingleton() {
        if (singleton == null) {
            synchronized (HeartBeatManager.class) {
                if (singleton == null) {
                    singleton = new HeartBeatManager();
                }
            }
        }
        return singleton;
    }

    private HeartBeatManager(){
    }

    public void start(){
        activate();
        threadHeatBeat.stopFlag = false;
        threadHeatBeat.start();
    }

    public void activate(){
        threadHeatBeat.active = true;
    }

    public void inactivate(){
        threadHeatBeat.active = false;
    }

    public void stop(){
        inactivate();
        threadHeatBeat.stopFlag = true;
        threadHeatBeat.interrupt();
    }

    private ThreadHeatBeat threadHeatBeat = new ThreadHeatBeat();

    private long lastHeartBeatTime = 0;

    static class ThreadHeatBeat extends Thread {
        boolean active = false;
        boolean stopFlag = false;
        public void run() {
            while (!stopFlag){
                try {
                    sleep(SLEEP_TIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (!active) continue;
                HeartBeatManager.getSingleton().sendRequestHeartBeat();
            }
        }
    }

}
