package lv.lu.training.lesson3;
//IESK
public class CatOwner {
    public static void main(String[] args) {

        Cat myCat = new Cat("blue", "Tom", "vilks", 5, 8); //Uzdevumā bija prasīts konstruktors ar trim parametriem
        System.out.println("My cat's color - " + myCat.getColor());
        System.out.println("name - " + myCat.getName());
        System.out.println("species - " + myCat.getSpecies());
        System.out.println("age - " + myCat.getAge());
        System.out.println("weight - " + myCat.getWeight());
        //uzdevuma aprakstā bija jādefinē konstruktorā neizmantotās vērtības ar seteriem

    }
}
