package lv.lu.training.homework7;

public class Palindroms {

    public static boolean isPalindrome(String text) {
        char[] ch = text.toCharArray();
        for (int i = ch.length - 1, j = 0; i >= 0; i--, j++) {
            char chI = Character.toUpperCase(ch[i]);
            char chJ = Character.toUpperCase(ch[j]);
            if (chI != chJ) {
                return false;
            }
        }
        return true;

    }
}
