package cn.bubi.sdk.core.balance.model;

/**
 * @author xiezhengchao@bubi.cn
 * @since 17/10/26 下午5:40.
 */
public class RpcServiceConfig{

    private String host;
    private int port;
    private boolean https = false;

    public RpcServiceConfig(String host, int port){
        this.host = host;
        this.port = port;
    }

    public RpcServiceConfig(String host, int port, boolean https){
        this.host = host;
        this.port = port;
        this.https = https;
    }

    public boolean isHttps(){
        return https;
    }

    public void setHttps(boolean https){
        this.https = https;
    }

    public String getHost(){
        return host;
    }

    public void setHost(String host){
        this.host = host;
    }

    public int getPort(){
        return port;
    }

    public void setPort(int port){
        this.port = port;
    }
}
