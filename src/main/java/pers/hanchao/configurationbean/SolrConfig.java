package pers.hanchao.configurationbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * TODO:<p>通过@Configuration注解配置文件，通过@Bean注解bean</p>
 * @author hanchao 2018/1/7 19:32
 **/
@Configuration
public class SolrConfig {

    @Bean("solrUtils")
    public SolrUtils solrInit(){
        //模拟读取solr的配置文件获取配置
        SolrUtils solrUtils = new SolrUtils();
        solrUtils.setHost("130.10.10.10");
        solrUtils.setPort(8983);
        solrUtils.setCloud(true);
        return  solrUtils;
    }
}
