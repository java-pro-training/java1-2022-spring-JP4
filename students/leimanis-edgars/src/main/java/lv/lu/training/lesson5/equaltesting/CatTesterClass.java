package lv.lu.training.lesson5.equaltesting;

public class CatTesterClass {

    public static void main(String[] args) {
        Cat myCat = new Cat("Cezars", 6, 3);

        Cat oskarsCat = new Cat("Cezars", 5, 3);

        //    printEquals(myCat, oskarsCat);
        printCat(myCat);

    }


    public static void printEquals(Cat firstCat, Cat secondCat) {
        System.out.println(firstCat.equals(secondCat));
    }

    public static void printCat(Cat cat) {
        System.out.println(cat);

    }

}
