package pers.hanchao.configurationbean;

public class SolrUtils {
    private String host;
    private int port;
    private boolean isCloud;

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

    public boolean isCloud() {
        return isCloud;
    }

    public void setCloud(boolean cloud) {
        isCloud = cloud;
    }

    public String getInstance(){
        return "SolrUtils[host:" + host
                + ",port:" + port
                + ",isCloud:" + isCloud + "]";
    }
}
