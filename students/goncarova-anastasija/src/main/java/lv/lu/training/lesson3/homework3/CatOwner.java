package lv.lu.training.lesson3.homework3;

public class CatOwner {
    public static void main(String[] args){
        Cat myCat = new Cat("black", "Tom", 5);
        myCat.setAge(5);
        myCat.setSpecies("Maine Coon");

        System.out.println("Me cat's color - " + myCat.getColor());
        System.out.println("name - " + myCat.getName());
        System.out.println("species - " + myCat.getSpecies());
        System.out.println("age - " + myCat.getAge());
        System.out.println("weight - " + myCat.getWeight());




    }
}
