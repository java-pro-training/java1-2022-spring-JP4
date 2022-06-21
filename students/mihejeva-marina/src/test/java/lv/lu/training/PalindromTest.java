package lv.lu.training;

import lv.lu.training.homework7.Palindroms;

public class PalindromTest {
    public static void main(String[] args) {
        boolean result = Palindroms.isPalindrome("Abba");
        if (result){
            System.out.println("string is palindrom");

        } else {
            System.out.println("string is not palindrom");
        }
    }
}
