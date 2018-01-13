package pers.hanchao.loosecoupling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO:<p>spring松耦合示例：通过配置xml中注入的bean，实现注入bean的灵活控制</p>
 * @author hanchao 2018/1/7 12:32
 **/
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/spring-loosecoupling.xml");
        MyFavoriteFruit myFavoriteFruit = (MyFavoriteFruit) context.getBean("myFavoriteFruit");
        myFavoriteFruit.showMyFavoriteFruit();
    }
}
