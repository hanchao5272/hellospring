package pers.hanchao.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO:<p>spring构造注入示例：通过配置xml中的constructor-arg标签</p>
 * @author hanchao 2018/1/7 12:32
 **/
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/spring-constructor.xml");
        MyFavoriteFruit myFavoriteFruit = (MyFavoriteFruit) context.getBean("myFavoriteFruit");
        myFavoriteFruit.showMyFavoriteFruit();
    }
}
