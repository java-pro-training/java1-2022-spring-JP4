package lv.lu.training.lesson3;

public class Dog {

    int age;
    String name;
    boolean hungry;

    public Dog(){
    }

    public Dog(int age, String name, boolean hungry) {
        this.age = age;
        this.name = name;
        this.hungry = hungry;

    }

    public void eat(){
        System.out.println("Dog is eating");
    }
}
