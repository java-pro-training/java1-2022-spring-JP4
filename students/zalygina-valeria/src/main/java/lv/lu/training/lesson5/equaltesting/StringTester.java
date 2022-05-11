package lv.lu.training.lesson5.equaltesting;

public class StringTester {
    public static void main(String[] args) {
        String value1 = ("Nosakums1");
        String value2 = new String("Nosakums1");
        System.out.println(value1.equals(value2));

        System.out.println(value1==value2);
    }
}
