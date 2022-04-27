package lv.lu.training.lesson3;

//IESK
public class CatOwner {
    public static void main(String[] args) {
        Cat myCat = new Cat("orange", "Fergio", 6.6f);
        myCat.setAge(9);
        myCat.setSpecies("British shorthair");
        System.out.println("My cat's color - " + myCat.getColor());
        System.out.println("name - " + myCat.getName());
        System.out.println("species - " + myCat.getSpecies());
        System.out.println("age - " + myCat.getAge() + " years");
        System.out.println("weight - " + myCat.getWeight() + " kg");
    }

}
