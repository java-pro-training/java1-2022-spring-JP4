package lv.lu.training.lesson3;

public class Dog {
    int age;
    String name = null;
    boolean hungry;

    public Dog(){
    }

    public Dog(int age, String name, boolean hungry){
        this.age = age;
        this.name = name;
        this.hungry = hungry;
    }

    // public Dog(String name) {       uzskates līdzeklis  Alt + insert  Constructor
    // this.name = name;
    //}

    public void eat(){
        System.out.println("Dog is eating");
    }
}
