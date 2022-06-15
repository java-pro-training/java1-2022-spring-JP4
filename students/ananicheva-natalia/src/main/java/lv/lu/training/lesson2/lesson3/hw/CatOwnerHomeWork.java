package lv.lu.training.lesson2.lesson3.hw;
//IESK
public class CatOwnerHomeWork {
    public static void main(String[] args) {
        CatHomeWork myCat = new CatHomeWork("black", "Tom", 5, 12, "sfinks");

        System.out.println("My cat's color - " + myCat.getColor());
        System.out.println("name - " + myCat.getName());
        System.out.println("species - " + myCat.getSpecies());
        System.out.println("age - " + myCat.getAge());
        System.out.println("weight - " + myCat.getWeight());

    }
}
