package lv.lu.training.HW3;
//IESK
public class CatOwner {
    public static void main(String[] args) {
        Cat myCat = new Cat("black", "Tom", 5);
        myCat.setAge(13);
        myCat.setSpecies("Wild");
        System.out.println("My cat's color - " + myCat.getColor());
        System.out.println("name - " + myCat.getName());
        System.out.println("species - " + myCat.getSpecies());
        System.out.println("age - " + myCat.getAge());
        System.out.println("weight - " + myCat.getWeight());

    }
}
