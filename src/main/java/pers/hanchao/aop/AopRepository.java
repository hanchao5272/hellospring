package pers.hanchao.aop;

import org.springframework.stereotype.Repository;

@Repository
public class AopRepository {
    public void showMessage() {
        System.out.println("No transaction!");
    }

    public void doSqlSuccess() {
        System.out.println("Execute Sql success!");
    }

    public void doSqlFailed() throws InterruptedException {
        System.out.println("Execute Sql failed!");
        Thread.sleep(2000);
        throw new NullPointerException();
    }
}
