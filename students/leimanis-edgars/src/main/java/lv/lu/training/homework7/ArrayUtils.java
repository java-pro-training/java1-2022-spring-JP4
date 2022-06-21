package lv.lu.training.homework7;

import java.util.Arrays;

//LABOT
// tukšs fails
public class ArrayUtils {

    private int intA, intB;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(new int[]{1, 2, 3})));
    }

    private static int[] reverse(int[] initial) {
        int[] result = new int[initial.length];
        for (int i = initial.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = initial[i];
        }
        return result;

    }

}
