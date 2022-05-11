package lv.lu.training.lesson3;

//IZLABOTS

//LABOT
public class Cat1Owner {
    public static void main(String[] args) {
        Cat1 myCat1 = new Cat1("black", "Tom", 5);
        myCat1.setAge("4");
        myCat1.setSpecies("Home cat");

        System.out.println("My cat's color - " + myCat1.getColor());
        System.out.println("My cat's name - " + myCat1.getName());
        System.out.println("My cat's weight - " + myCat1.getWeight());
        System.out.println("My cat's age - " + myCat1.setAge());
        System.out.println("My cat's species - " + myCat1.setSpecies());

        //trūkst uzdevuma beigas, jādefinē trūkstošās vērtības ar seteriem


    }

}
