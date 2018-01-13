package pers.hanchao.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * TODO:<p>自定义数据库事物拦截器(模拟)</p>
 * @author hanchao 2018/1/8 23:22
 **/
public class MyDbInterceptor implements MethodInterceptor{

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        String beanName = methodInvocation.getThis().toString();
        String method = methodInvocation.getMethod().getName();
        System.out.println("[beanName:" + beanName + ",method:" + method + "]");
        System.out.println("Transaction begin：conn.setAutoCommit(false);");
        try{
            Object result = methodInvocation.proceed();
            System.out.println("Transaction commit：conn.commit();");
            return result;
        }catch (Exception e){
            System.out.println("Transaction rollback：conn.rollback();");
            e.printStackTrace();
            return null;
        }finally {
            System.out.println("Db connection closed：ps1.close();conn.close();");
        }
    }
}
