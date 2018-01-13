package pers.hanchao.configurationbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * TODO:<p>通过@Configuration注解配置文件，通过@Bean注解bean</p>
 * @author hanchao 2018/1/7 19:32
 **/
@Configuration
public class RedisConfig {
    @Bean("redisUtils")
    public RedisUtils redisInit(){
        //模拟读取redis的配置文件获取配置
        RedisUtils redisUtils = new RedisUtils();
        redisUtils.setHost("222.222.222.222");
        redisUtils.setPort(6379);
        redisUtils.setCluster(false);
        redisUtils.setPassword("12345");
        return redisUtils;
    }
}
