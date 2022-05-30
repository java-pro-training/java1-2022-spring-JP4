package lv.lu.training.lesson7;

import java.util.Arrays;

public class PlayWithArray {

    public static void main(String[] args) {

        int[] xxx;
        xxx = new int[5];

//        basicArray();
//        forEachTest();
        fillArray();
    }

    private static void fillArray() {
        int[] myArray = new int[10];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = myArray.length - i;
        }


        for (int i : myArray) {
            System.out.println("Result: " + Arrays.toString(myArray));
        }
    }


    private static void forEachTest() {
        String[] myStringArray = new String[3];
        myStringArray[0] = "Intars";
        myStringArray[1] = "Anna";
        myStringArray[2] = "Karlis";

        for (String a : myStringArray) {
            //izpilde
            System.out.println(a);
        }
    }


    private static void basicArray() {
        int[] myIntArray = new int[5];
        myIntArray[0] = 1;
        myIntArray[1] = 2;
        myIntArray[2] = 3;
        myIntArray[3] = 4;
        myIntArray[4] = 5;

        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = myIntArray[i] + 4;
        }
        System.out.println(Arrays.toString(myIntArray));
    }
}
