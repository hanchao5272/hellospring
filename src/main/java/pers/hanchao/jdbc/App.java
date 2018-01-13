package pers.hanchao.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
/**
 * <p>简单测试通过Spring JDBC进行数据库的增删查改</p>
 * @author hanchao 2018/1/10 22:49
 **/
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config/spring-jdbc.xml");
        QuestionDaoImpl2 questionDao = (QuestionDaoImpl2) context.getBean("questionDao");
        System.out.println("第一次查询：");
        List<Question> questionList = questionDao.queryAll();
        for (int i = 0; i < questionList.size(); i++) {
            System.out.println(questionList.get(i).toString());
        }

        System.out.println("插入数据");
        questionDao.insert(new Question("题目1",10,"今天天气好吗？"));
        questionDao.insert(new Question("题目2",20,"你吃了吗？"));
        questionDao.insert(new Question("题目3",5,"开心吗？"));

        System.out.println("第二次查询：");
        questionList = questionDao.queryAll();
        for (int i = 0; i < questionList.size(); i++) {
            System.out.println(questionList.get(i).toString());
        }

        System.out.println("第三次查询：");
//        System.out.println(questionDao.queryById("1"));

        System.out.println("删除");
        questionDao.deleteAll();
    }
}
