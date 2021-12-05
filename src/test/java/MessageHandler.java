import java.util.concurrent.TimeUnit;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.EventLoop;
import io.netty.util.ReferenceCountUtil;

public class MessageHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
        System.out.println("通道注册:" + ctx.toString());
        super.channelRegistered(ctx);
    }

    /**
     * 建立连接时
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        ServerConnection.getSingleton().ctx = ctx;
        System.out.println("客户端与服务器建立连接:" + ctx.toString());
        ctx.fireChannelActive();
    }

    /**
     * 关闭连接时
     */
    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        //使用过程中断线重连
        final EventLoop eventLoop = ctx.channel().eventLoop();
        eventLoop.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("客户端尝试重新连接服务器:" + ctx.toString());
                ServerConnection.getSingleton().doConnect();
            }
        }, 1L, TimeUnit.SECONDS);
        super.channelInactive(ctx);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        System.err.println("客户端异常,异常信息:{}:" + ctx.toString());
        cause.printStackTrace();
        ctx.close();
    }

    //业务逻辑处理
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        //非protobuf格式数据
        if (!(msg instanceof CBMessage.Response)) {
            System.err.println("channelRead:" + ctx.toString());
            return;
        }
        try {
            CBMessage.Response message = (CBMessage.Response) msg;

            switch (message.getType()){
                case CONNECT:
                    System.out.println(this.getClass().getSimpleName() + "responsed:CONNECT");
                    break;
                default:
                    break;
            }
        }catch (Exception e) {
            System.err.println("channelRead" + e.getMessage());
        } finally {
            ReferenceCountUtil.release(msg);
        }
    }

}
