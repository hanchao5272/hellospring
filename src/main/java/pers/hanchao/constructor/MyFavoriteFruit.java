package pers.hanchao.constructor;

public class MyFavoriteFruit {
    private Fruit fruit;

//    //通过setter注入
//    public void setFruit(Fruit fruit) {
//        this.fruit = fruit;
//    }

    //通过constructor注入
    public MyFavoriteFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    public void showMyFavoriteFruit(){
        System.out.println("My favorite fruit is " + this.fruit.showName());
    }
}
