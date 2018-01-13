package pers.hanchao.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AopController {
    @Autowired
    private AopService aopService;

    public void showMessage(){
        this.aopService.showMessage();
    }

    public void doSqlSuccess(){
        this.aopService.goodSave();
    }

    public void doSqlFailed() throws InterruptedException {
        this.aopService.badBc();
    }
}
