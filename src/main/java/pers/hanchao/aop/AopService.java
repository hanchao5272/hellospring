package pers.hanchao.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AopService {
    @Autowired
    private AopRepository aopRepository;

    public void showMessage() {
        this.aopRepository.showMessage();
    }

    public void goodSave(){
        this.aopRepository.doSqlSuccess();
    }

    public void badBc() throws InterruptedException {
        this.aopRepository.doSqlFailed();
    }
}
