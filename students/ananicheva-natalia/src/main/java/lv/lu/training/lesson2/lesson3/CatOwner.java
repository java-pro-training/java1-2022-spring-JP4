package lv.lu.training.lesson2.lesson3;

public class CatOwner {
    public static void main(String[] args) {
        Cat myCat = new Cat( "Mincis", false);
        System.out.println(myCat.getName());
        System.out.println("/////////////////////////");
        myCat.setName("Cesars");
        System.out.println(myCat.getName());
    }
}
