package pers.hanchao.propertyplaceholderconfigurer;

public class SolrUtils {

    private String host;
    private String defaultCollection;

    public void setHost(String host) {
        this.host = host;
    }

    public void setDefaultCollection(String defaultCollection) {
        this.defaultCollection = defaultCollection;
    }

    @Override
    public String toString(){
        return "solrUtils[host:" + host + ",defaultCollection:" +defaultCollection + "]";
    }
}
