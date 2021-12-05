public class TestClient {

    public static void main(String[] args) throws InterruptedException {
        ServerConnection.getSingleton().initChannel();

        Thread.sleep(1000);

        ServerConnection.getSingleton().sendRequestConnect();

        HeartBeatManager.getSingleton().start();

        Thread.sleep(100000);
    }

}
