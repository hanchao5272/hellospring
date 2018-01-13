package pers.hanchao.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO:<p>spring构造注入示例：通过配置xml中的constructor-arg标签</p>
 * @author hanchao 2018/1/7 12:32
 **/
public class App {
    public static void main(String[] args) {
        //默认的自动装配类型：通过setter注入的形式，在xml中指定ref属性，实现自动装配
        autowireByDefault();

        //byType的自动装配类型，通过setter注入的形式，在xml中指定autowire=byType，实现自动装配
        autowireByType();

        //byName的自动装配类型，通过setter注入的形式，在xml中指定autowire=byName，实现自动装配
        autowireByName();

        //byConstructor的自动装配类型，通过setter注入的形式，在xml中指定autowire=constructor，实现自动装配
        autowireByConstructor();

        //byAutodetect的自动装配类型，先byContstructor，再byType的组合自动装配方式
        autowireByAutoDetect();

        //byAnnotation的自动装配类型，及@Autowire注解的方式
        autowireByAnnotation();
    }
    private static void autowireByDefault() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/spring-autowire/spring-autowire-default.xml");
        MyFavoriteAutowireType myFavoriteAutowireType = (MyFavoriteAutowireType) context.getBean("myFavoriteAutowireType");
        myFavoriteAutowireType.showMyFavoriteAutowireType();
    }
    private static void autowireByType() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/spring-autowire/spring-autowire-bytype.xml");
        MyFavoriteAutowireType myFavoriteAutowireType = (MyFavoriteAutowireType) context.getBean("myFavoriteAutowireType");
        myFavoriteAutowireType.showMyFavoriteAutowireType();
    }
    private static void autowireByName() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/spring-autowire/spring-autowire-byname.xml");
        MyFavoriteAutowireType myFavoriteAutowireType = (MyFavoriteAutowireType) context.getBean("myFavoriteAutowireType");
        myFavoriteAutowireType.showMyFavoriteAutowireType();
    }
    private static void autowireByConstructor() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/spring-autowire/spring-autowire-constructor.xml");
        MyFavoriteAutowireType myFavoriteAutowireType = (MyFavoriteAutowireType) context.getBean("myFavoriteAutowireType");
        myFavoriteAutowireType.showMyFavoriteAutowireType();
    }
    private static void autowireByAutoDetect() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/spring-autowire/spring-autowire-autodetect.xml");
        MyFavoriteAutowireType myFavoriteAutowireType = (MyFavoriteAutowireType) context.getBean("myFavoriteAutowireType");
        myFavoriteAutowireType.showMyFavoriteAutowireType();
    }
    private static void autowireByAnnotation() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/spring-autowire/spring-autowire-annotation.xml");
        MyFavoriteAutowireTypeByAnnotation myFavoriteAutowireTypeByAnnotation = (MyFavoriteAutowireTypeByAnnotation) context.getBean("myFavoriteAutowireTypeByAnnotation");
        myFavoriteAutowireTypeByAnnotation.showMyFavoriteAutowireType();
    }

}
