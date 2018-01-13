package pers.hanchao.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @Autowired
    private DemoRepository demoRepository;

    public void showMessage() {
        this.demoRepository.showMessage();
        System.out.println("@Service is success！");
    }
}
