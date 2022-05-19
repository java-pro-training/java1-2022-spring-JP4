package lv.lu.training.lesson7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PlayWithArray {

    public static void main(String[] args) {

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
