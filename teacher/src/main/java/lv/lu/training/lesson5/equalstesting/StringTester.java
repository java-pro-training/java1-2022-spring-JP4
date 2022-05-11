package lv.lu.training.lesson5.equalstesting;

public class StringTester {

    public static void main(String[] args) {

        String value1 = "Nosaukums1";
        String value2 = new String("Nosaukums1");
        System.out.println(value1.equals(value2));


        System.out.println(value1==value2);

    }


}
