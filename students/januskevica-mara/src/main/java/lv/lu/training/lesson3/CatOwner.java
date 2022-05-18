package lv.lu.training.lesson3;
//IESK
public class CatOwner {
    public static void main(String[] args) {
        Cat myCat = new Cat("black", "Tom", 5);
        myCat.setAge(7);
        String siamese = "Siamese";
        myCat.setSpecies(siamese);
        System.out.println("My cat's colour - " + myCat.getColor());
        System.out.println("name - " + myCat.getName());
        System.out.println("species - " + myCat.getSpecies());
        System.out.println("age - " + myCat.getAge());
        System.out.println("weight - " + myCat.getWeight());
    }
}
