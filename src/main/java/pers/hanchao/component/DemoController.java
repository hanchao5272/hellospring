package pers.hanchao.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DemoController {
    @Autowired
    private DemoService demoService;

    public void showMessage(){
        this.demoService.showMessage();
        System.out.println("@Controller is success!");
    }
}
