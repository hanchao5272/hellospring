package pers.hanchao.mail;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.mail.MessagingException;

/**
 * <p>简单对Spring mail的应用：简单消息邮件、附件邮件以及html邮件</p>
 * @author hanchao 2018/1/13 11:36
 **/
public class App {

    public static void main(String[] args) throws MessagingException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/spring-mail.xml");
        MailUtils mailUtils = (MailUtils) context.getBean("mailUtils");
        mailUtils.sendSimpleMail("hanchao5272@163.com","hanchao5272@163.com",
                "简单邮件测试","这是一个简单邮件发送示例：Hello World");

        String attachPath = "C:\\Users\\hanchao\\Pictures\\Saved Pictures\\红狼.jpg";
        mailUtils.sendMimeMail("hanchao5272@163.com","hanchao5272@163.com",
                "HTML邮件测试","这是一个HTML邮件发送示例：Hello World",MailTemplate.TEMPLATE_TEST,attachPath);
    }
}
