package lv.lu.training.lesson7;

import java.util.Scanner;
//IESK
public class PalindromeTest {
    public static void main(String[] args) {
        System.out.println("Please enter a word to check if it is a palindrome");
        Scanner scanner = new Scanner(System.in);
        if (Palindrome.isPalindrome(scanner.nextLine())) {
            System.out.println("Entered word is a palindrome");
        } else {
            System.out.println("Entered word in not a palindrome");
        }
    }
}
