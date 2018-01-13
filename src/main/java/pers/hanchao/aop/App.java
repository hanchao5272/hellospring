package pers.hanchao.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO:<p>在Spring框架中，通过自定义的数据库事物拦截器，对所有的Service层的Bean中的*Save和*Bc方法进行事务控制。</p>
 * @author hanchao 2018/1/8 23:22
 **/
public class App {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/spring-aop.xml");
        AopController aopController = (AopController) context.getBean("aopController");
        //模拟数据库查询，不涉及事务控制
        aopController.showMessage();
        Thread.sleep(2000);//为了更好的打印控制台信息
        //模拟数据库执行成功的情况
        System.out.println("============================");
        aopController.doSqlSuccess();
        Thread.sleep(2000);
        //模拟数据库执行中报错的情况
        System.out.println("============================");
        aopController.doSqlFailed();
    }
}
