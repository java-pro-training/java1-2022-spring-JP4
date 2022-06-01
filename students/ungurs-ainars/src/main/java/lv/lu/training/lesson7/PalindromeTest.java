package lv.lu.training.lesson7;

public class PalindromeTest {
    public static void main(String[] args) {
        boolean result = Palindrome.isPalindrome(new String[]{"r", "a", "c", "e", "c", "a", "r"});

        System.out.print("Checking if palindrome checker is working: ");
        if (result) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
