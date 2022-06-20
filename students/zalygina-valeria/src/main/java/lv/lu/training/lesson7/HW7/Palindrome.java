package lv.lu.training.lesson7.HW7;

import java.util.Arrays;
import java.util.Locale;

public class Palindrome {
  public static boolean isPalindrome(String text) {
      String input = text.toLowerCase();
      char[] original = input.toCharArray();
      char[] reverse = new char[text.length()];
      for (int i = text.length() - 1, j =0; i >= 0; j++, i--){
          reverse[j] = original[i];
      }
      return Arrays.equals(reverse, original);
  }
}

