package pers.hanchao.autowire;



public class MyFavoriteAutowireType {

    public MyFavoriteAutowireType() {
    }

    private DefaultAutoWire defaultAutoWire;
    //通过setter注入
    public void setDefaultAutoWire(DefaultAutoWire defaultAutoWire) {
        this.defaultAutoWire = defaultAutoWire;
    }

    private ByTypeAutoWire byTypeAutoWire;
    //通过setter注入
    public void setByTypeAutoWire(ByTypeAutoWire byTypeAutoWire) {
        this.byTypeAutoWire = byTypeAutoWire;
    }

    private ByNameAutoWire byNameAutoWire;
    //通过setter注入
    public void setByNameAutoWire(ByNameAutoWire byNameAutoWire) {
        this.byNameAutoWire = byNameAutoWire;
    }

    private ConstructorAutoWire constructorAutoWire;
    //通过constructor注入
    public MyFavoriteAutowireType(ConstructorAutoWire constructorAutoWire) {
        this.constructorAutoWire = constructorAutoWire;
    }

    private AutodetectAutoWire autodetectAutoWire;
    //通过constructor注入
    public MyFavoriteAutowireType(AutodetectAutoWire autodetectAutoWire) {
        this.autodetectAutoWire = autodetectAutoWire;
    }
    //通过setter注入
    public void setAutodetectAutoWire(AutodetectAutoWire autodetectAutoWire) {
        this.autodetectAutoWire = autodetectAutoWire;
    }

    public void showMyFavoriteAutowireType(){
        if (null != defaultAutoWire)
            System.out.println("My favorite autowire type is " + this.defaultAutoWire.showName());

        if (null != byTypeAutoWire)
            System.out.println("My favorite autowire type is " + this.byTypeAutoWire.showName());

        if (null != byNameAutoWire)
            System.out.println("My favorite autowire type is " + this.byNameAutoWire.showName());

        if (null != constructorAutoWire)
            System.out.println("My favorite autowire type is " + this.constructorAutoWire.showName());

        if (null != autodetectAutoWire)
            System.out.println("My favorite autowire type is " + this.autodetectAutoWire.showName());
    }
}
