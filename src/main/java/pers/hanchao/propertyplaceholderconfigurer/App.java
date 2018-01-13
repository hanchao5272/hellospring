package pers.hanchao.propertyplaceholderconfigurer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * <p>对PropertyPlaceholderConfigurer的实例代码</p>
 * @author hanchao 2018/1/11 22:41
 **/
public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/spring-propertyplaceholderconfigurer.xml");
        SolrUtils solrUtils = (SolrUtils) context.getBean("solrUtils");
        System.out.println(solrUtils.toString());

        DataSource dataSource = (DataSource) context.getBean("dataSource");
        System.out.println(dataSource.toString());
    }
}
