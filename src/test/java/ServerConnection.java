import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

public class ServerConnection {

    private volatile static ServerConnection singleton;
    public static ServerConnection getSingleton() {
        if (singleton == null) {
            synchronized (ServerConnection.class) {
                if (singleton == null) {
                    singleton = new ServerConnection();
                }
            }
        }
        return singleton;
    }

    private ServerConnection(){
    }

    private String serverHost = "127.0.0.1";
    private int serverPort = 8989;

    /// 通过nio方式来接收连接和处理连接
    private EventLoopGroup group = new NioEventLoopGroup();
    private Bootstrap bootstrap = new Bootstrap();
    public Channel channel;

    public ChannelHandlerContext ctx;

    /**
     * Netty创建全部都是实现自AbstractBootstrap。
     * 客户端的是Bootstrap，服务端的则是    ServerBootstrap。
     **/

    public void initChannel() {
        try {
            bootstrap.group(group);
            bootstrap.channel(NioSocketChannel.class);
            bootstrap.handler(new CustomChannelInitializer());
            bootstrap.remoteAddress(serverHost, serverPort);
            // 连接服务端
            ChannelFuture f = bootstrap.connect();
            f.addListener(new ConnectionListener());
            channel = f.channel();
        } catch (NumberFormatException e) {
            System.err.println(this.getClass().getSimpleName() + "客户端连接失败，请检查ip与端口！");
        }
    }

    public void sendRequestConnect(){
        CBMessage.Request.Builder requestBuilder = CBMessage.Request.newBuilder();
        requestBuilder.setType(CBMessage.Type.CONNECT);
        CBMessage.RequestConnect.Builder requestConnectBuilder = CBMessage.RequestConnect.newBuilder();
        requestBuilder.setRequestConnect(requestConnectBuilder.build());
        sendRequest(requestBuilder);
    }

    public boolean sendRequest(CBMessage.Request.Builder builder){
        if (ctx == null) return false;
        if (ctx.isRemoved()) return false;

        builder
                .setTimestamp(DateUtil.getTimeStamp())
                .setClientId("");

        System.out.println(this.getClass().getSimpleName() + " sendRequest:" + builder.build().toString());

        byte bytes[] = builder.build().toByteArray();

        ByteBuf buf = Unpooled.buffer(3 + bytes.length);
        buf.writeBytes(bytes);
        buf.writeBytes("$_$".getBytes());

        writeByteBuf(ctx, buf);
        return true;

    }

    public static void writeByteBuf(ChannelHandlerContext ctx, ByteBuf byteBuf) {
        ctx.writeAndFlush(byteBuf);
    }

    public void doConnect() {
        ChannelFuture f = null;
        try {
            if (bootstrap != null) {
                f = bootstrap.connect().addListener(new ConnectionListener());
                channel = f.channel();
            }
        } catch (Exception e) {
            System.err.println(this.getClass().getSimpleName() + "客户端连接失败!");
        }

    }


}
