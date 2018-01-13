package pers.hanchao.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO:<p>hellospring</p>
 * @author hanchao 2018/1/7 12:15
 **/
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/spring-helloworld.xml");
        HelloSpring helloSpring = (HelloSpring) context.getBean("helloSpring");
        helloSpring.printHello();
    }
}
