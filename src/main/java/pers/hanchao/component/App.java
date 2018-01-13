package pers.hanchao.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO:<p>通过@Component、@Controller、@Service、@Repository注解进行bean的定义，通过@Autowired进行bean的自动装配</p>
 * @author hanchao 2018/1/7 19:51
 **/
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/spring-component.xml");
        //@Component
        DemoComponent demoComponent = (DemoComponent) context.getBean("demoComponent");
        demoComponent.showMessage();
        //@Controller、@Service、@Repository+@Autowired构成的三层注解
        DemoController demoController = (DemoController) context.getBean("demoController");
        demoController.showMessage();
    }
}
