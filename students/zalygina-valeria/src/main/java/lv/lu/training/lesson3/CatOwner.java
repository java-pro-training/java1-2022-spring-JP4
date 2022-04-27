package lv.lu.training.lesson3;
//LABOT
//Koda nedarbojas
public class CatOwner {
    public static void main(String[] args) {

        Cat myCat = new Cat("black", "Tom", 5);

        myCat.setAge(2);
        myCat.setSpecies("Fat");

        System.out.println("My cat's color -" + myCat.getColor());
        System.out.println("name - " + myCat.getName());
//        System.out.println("species - " + myCat.getSpecies()); //trūkst getSpecies klasē CAT
        System.out.println("age - " + myCat.getAge());
        System.out.println("weight - " + myCat.getWeight());
    }
}
