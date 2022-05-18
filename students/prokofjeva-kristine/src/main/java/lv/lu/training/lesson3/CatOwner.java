package lv.lu.training.lesson3;

public class CatOwner {
    public static void main(String[] args) {
        Cat myCat = new Cat("Mincis", false);
        String myCatName = myCat.getName();

        System.out.println(myCat.getName());
        System.out.println("/////////");
        myCat.setName("Cezars");
        System.out.println(myCat.getName());
    }
}
