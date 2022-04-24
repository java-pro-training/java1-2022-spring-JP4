package lv.lu.training.lesson3;

//LABOT
public class Cat1Owner {
    public static void main(String[] args) {
        Cat1 myCat1 = new Cat1("black", "Tom", 5);

        System.out.println("My cat's color - " + myCat1.getColor());
        System.out.println("My cat's name - " + myCat1.getName());
        System.out.println("species -" + myCat1.getSpecies());
        System.out.println("age - " + myCat1.getAge());
        System.out.println("weight - " + myCat1.getWeight());

        //trūkst uzdevuma beigas, jādefinē trūkstošās vērtības ar seteriem

    }

}
