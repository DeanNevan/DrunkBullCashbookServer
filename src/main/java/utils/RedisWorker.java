package utils;

import client.CBClient;
import com.alibaba.fastjson.JSONObject;
import redis.clients.jedis.Jedis;
import utils.connection.redis.RedisConnection;

public class RedisWorker {
    private volatile static RedisWorker singleton;
    public static RedisWorker getSingleton() {
        if (singleton == null) {
            synchronized (RedisWorker.class) {
                if (singleton == null) {
                    singleton = new RedisWorker();
                }
            }
        }
        return singleton;
    }

    public void init(){
    }

    public void updateClient(CBClient client){
        Jedis jedis = RedisConnection.getSingleton().getJedis();
        String jsonString = jedis.hget("clients:all", client.client_id);
        JSONObject object = JSONObject.parseObject(jsonString);
        if (object == null) object = new JSONObject();
        client.parseToJSONObject(object);
        String string = object.toJSONString();
        jedis.hset("clients:all", client.client_id, string);
        RedisConnection.getSingleton().close(jedis);
    }

    public void removeClient(CBClient client){
        Jedis jedis = RedisConnection.getSingleton().getJedis();
        jedis.hdel("clients:all", String.valueOf(client.client_id));
        RedisConnection.getSingleton().close(jedis);
    }

    public void removeClientViaID(String client_id){
        Jedis jedis = RedisConnection.getSingleton().getJedis();
        jedis.hdel("clients:all", String.valueOf(client_id));
        RedisConnection.getSingleton().close(jedis);
    }

}
