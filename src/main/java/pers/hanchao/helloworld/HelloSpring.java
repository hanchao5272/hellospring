package pers.hanchao.helloworld;

/**
 * TODO:<p>springhello：通过xml配置bean,注入值到bean</p>
 * @author hanchao 2018/1/7 12:18
 **/
public class HelloSpring {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printHello(){
        System.out.println("hello spring:" + this.name);
    }
}
