package pers.hanchao.component;

import org.springframework.stereotype.Repository;

@Repository
public class DemoRepository {
    public void showMessage() {
        System.out.println("@Repository is success!");
    }
}
