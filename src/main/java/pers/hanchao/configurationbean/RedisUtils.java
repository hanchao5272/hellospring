package pers.hanchao.configurationbean;

public class RedisUtils {
    private String host;
    private int port;
    private boolean isCluster;
    private String password;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public boolean isCluster() {
        return isCluster;
    }

    public void setCluster(boolean cluster) {
        isCluster = cluster;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInstance(){
        return "RedisUtils[host:" + host
                + ",port:" + port
                + ",password:" + password
                + ",isCluster:" + isCluster + "]";
    }
}
