package pers.hanchao.configurationbean;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
/**
 * TODO:<p>通过@Configuration注解配置文件，通过@Import注解多个配置文件</p>
 * @author hanchao 2018/1/7 19:32
 **/
@Configuration
@Import({RedisConfig.class,SolrConfig.class})
public class AnnotationConfig {}
