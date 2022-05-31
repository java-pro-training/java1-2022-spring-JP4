package lv.lu.training.lesson7;

import java.util.Arrays;

public class Palindrome {
    public static boolean isPalindrome(String[] array) {

        String[] reverse = new String[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != reverse[i]) {
                return false;
            }
        }

        return true;
    }
}


