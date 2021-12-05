package server;

import client.CBServerClientHeartBeatManager;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import protobuf.MyProto;
import utils.MysqlWorker;
import utils.connection.MysqlConnection;
import utils.connection.redis.RedisConnection;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class CBServer extends Thread{
    public Logger logger = LoggerFactory.getLogger(CBServer.class);
    private volatile static CBServer singleton;
    private int port = 8989;

    public static CBServer getSingleton() {
        if (singleton == null) {
            synchronized (CBServer.class) {
                if (singleton == null) {
                    singleton = new CBServer();
                }
            }
        }
        return singleton;
    }

    public void startServer() {
        port = getPort();
        logger.info(String.format("服务器获取端口...ok"));
        Runtime.getRuntime().addShutdownHook(this);
        MysqlConnection.getSingleton().init(logger, "");
        logger.info(String.format("Sql数据库连接...ok"));
        RedisConnection.getSingleton().init(logger, "");
        logger.info(String.format("Redis数据库连接...ok"));
        CBServerClientHeartBeatManager.getSingleton().startMonitor();
        logger.info(String.format("服务器启动...ok"));
    }

    public static void main(String[] args) throws Exception{
        getSingleton().startServer();
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        EventLoopGroup wokerGroup = new NioEventLoopGroup();

        try{
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap.group(bossGroup,wokerGroup).channel(NioServerSocketChannel.class)
                    .handler(new LoggingHandler(LogLevel.DEBUG))
                    .childHandler(new CBServerInitializer());

            ChannelFuture channelFuture = serverBootstrap.bind(getSingleton().port).sync();
            channelFuture.channel().closeFuture().sync();
        }finally {
            bossGroup.shutdownGracefully();
            wokerGroup.shutdownGracefully();
        }
    }

    public void run() {
        closeServer();
    }

    public void closeServer(){
        MysqlConnection.getSingleton().close();
        CBServerClientHeartBeatManager.getSingleton().stopMonitor();
        logger.info(String.format("服务器关闭"));
    }

    private Properties properties;
    int getPort(){
        InputStream is;
        try {
            is = this.getClass().getResourceAsStream("/server_config.properties");
            this.properties = new Properties();
            this.properties.load(is);
            //@Value("#{'${my.config.values}'.split(',')}");
            int port = Integer.parseInt(properties.getProperty("port"));
            return port;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 8989;
    }


}
