package client;

import com.alibaba.fastjson.JSONObject;
import io.netty.channel.ChannelHandlerContext;

public class CBClient {

    public boolean admin = false;
    public boolean write = false;
    public boolean read = false;

    public enum State {
        UNKNOWN, CONNECTED, AUTHENTICATED, CLOSED
    }
    private State state = State.UNKNOWN;
    public boolean authenticated = false;
    public String username;
    public String groupname;
    public String nickname;
    public String password;
    public String deviceID;
    public String client_id = "";
    public ChannelHandlerContext ctx;

    public CBClient(String client_id){
        this.client_id = client_id;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void parseToJSONObject(JSONObject jsonObject){
        if (jsonObject.getString("client_id") == null) {
            jsonObject.put("client_id", client_id);
        } else {
            jsonObject.replace("client_id", client_id);
        }
        if (jsonObject.getString("username") == null) {
            jsonObject.put("username", username);
        } else {
            jsonObject.replace("username", username);
        }
        if (jsonObject.getString("groupname") == null) {
            jsonObject.put("groupname", groupname);
        } else {
            jsonObject.replace("groupname", groupname);
        }

        if (jsonObject.getBoolean("admin") == null) {
            jsonObject.put("admin", admin);
        } else {
            jsonObject.replace("admin", admin);
        }
        if (jsonObject.getBoolean("read") == null) {
            jsonObject.put("read", read);
        } else {
            jsonObject.replace("read", read);
        }
        if (jsonObject.getBoolean("write") == null) {
            jsonObject.put("write", write);
        } else {
            jsonObject.replace("write", write);
        }

        if (jsonObject.getString("nickname") == null) {
            jsonObject.put("nickname", nickname);
        } else {
            jsonObject.replace("nickname", nickname);
        }
        if (jsonObject.getString("state") == null) {
            jsonObject.put("state", getState());
        } else {
            jsonObject.replace("state", getState());
        }
        if (jsonObject.getBoolean("authenticated") == null) {
            jsonObject.put("authenticated", authenticated);
        } else {
            jsonObject.replace("authenticated", authenticated);
        }
    }

}
