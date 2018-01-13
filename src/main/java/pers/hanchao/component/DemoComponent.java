package pers.hanchao.component;

import org.springframework.stereotype.Component;

@Component
public class DemoComponent {
    public void showMessage(){
        System.out.println("@Component is success！");
    }
}
