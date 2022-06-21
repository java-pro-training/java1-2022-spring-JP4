package lv.lu.training.HomeWork7;

import java.util.Scanner;
//IESK
public class IsPalindromeStringText {

    public static void main(String[] args) {
        //racecar, level, sum summus mus

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your word: ");
        String string = scanner.next();
        String newString = "";

        String palindrome = string;

        for (int i = string.length() - 1; i >= 0; i--) {
            newString = newString + string.charAt(i);
        }
        if (palindrome.equals(newString)) {
            System.out.println("Word is palindrome");
        } else {
            System.out.println("Word is not palindrome");


        }
    }
}
