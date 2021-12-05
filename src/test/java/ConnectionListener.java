import java.util.concurrent.TimeUnit;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.EventLoop;

public class ConnectionListener implements ChannelFutureListener {

    @Override
    public void operationComplete(ChannelFuture channelFuture) throws Exception {
        if (!channelFuture.isSuccess()) {
            final EventLoop loop = channelFuture.channel().eventLoop();
            loop.schedule(()->{
                System.err.println("客户端连接服务器失败，开始重连操作...");
                ServerConnection.getSingleton().doConnect();
            }, 5L, TimeUnit.SECONDS);
            System.err.println("客户端连接服务器失败，开始重连操作...");
        } else {
            System.err.println("客户端连接服务器成功！");
        }
    }

}
