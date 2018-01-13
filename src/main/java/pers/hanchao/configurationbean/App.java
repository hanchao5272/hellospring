package pers.hanchao.configurationbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * TODO:<p>通过@Configuration注解配置文件，通过@Bean注解bean，通过@Import注解多个配置文件</p>
 * @author hanchao 2018/1/7 19:12
 **/
public class App {

    public static void main(String[] args) {
        /**
         * 以xml的形式：
         * ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
         *
         * 以注解的形式(不需要配置文件)
         * ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
         */
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
        RedisUtils redisUtils = (RedisUtils) context.getBean("redisUtils");
        System.out.println(redisUtils.getInstance());
        SolrUtils solrUtils = (SolrUtils) context.getBean("solrUtils");
        System.out.println(solrUtils.getInstance());
    }
}
