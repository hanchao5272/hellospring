package pers.hanchao.loosecoupling;

public class MyFavoriteFruit {
    private Fruit fruit;

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }

    public void showMyFavoriteFruit(){
        System.out.println("My favorite fruit is " + this.fruit.showName());
    }
}
