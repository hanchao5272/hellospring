package pers.hanchao.mail;

/**
 * <p>邮件模板示例</p>
 * @author hanchao 2018/1/13 11:36
 **/
public class MailTemplate {
    public static final int TEMPLATE_TEST = 1;

    public static String getText(int templateType,String message){
        switch (templateType){
            case 1:
                return "<html>\n" +
                        "<body style=\"background-color:PowderBlue;\">\n" +
                        "<p style=\"font-family:times;color:green;font-size:30px\">\n" +
                        message + "</p>\n" +
                        "</body>\n" +
                        "</html>";
                default:
                    return message;
        }
    }
}
