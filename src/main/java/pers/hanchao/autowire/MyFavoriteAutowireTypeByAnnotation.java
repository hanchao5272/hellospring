package pers.hanchao.autowire;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MyFavoriteAutowireTypeByAnnotation {

    private DefaultAutoWire defaultAutoWire;
    //通过@Autowired注解setter，默认按byType自动装配
    @Autowired
    public void setDefaultAutoWire(DefaultAutoWire defaultAutoWire) {
        this.defaultAutoWire = defaultAutoWire;
    }

    //通过@Autowired注解字段，默认按byType自动装配
    @Autowired
    private ByTypeAutoWire byTypeAutoWire;

    //通过@Autowired注解字段，通过@Qualifier指定按byName自动装配
    @Autowired
    @Qualifier("byNameAutoWire")
    private ByNameAutoWire byNameAutoWire;


    private ConstructorAutoWire constructorAutoWire;
    //通过@Autowired注解constructor，默认按byType自动装配
    @Autowired
    public MyFavoriteAutowireTypeByAnnotation(ConstructorAutoWire constructorAutoWire) {
        this.constructorAutoWire = constructorAutoWire;
    }

    public void showMyFavoriteAutowireType(){
        if (null != defaultAutoWire)
            System.out.println("My favorite autowire type is @Autowire setter方法");

        if (null != byTypeAutoWire)
            System.out.println("My favorite autowire type is @Autowire 字段(按类型)");

        if (null != byNameAutoWire)
            System.out.println("My favorite autowire type is @Autowire 字段(按名称)");

        if (null != constructorAutoWire)
            System.out.println("My favorite autowire type is @Autowire 构造方法");

    }
}
