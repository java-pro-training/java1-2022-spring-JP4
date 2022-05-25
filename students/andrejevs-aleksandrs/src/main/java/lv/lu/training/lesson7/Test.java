package lv.lu.training.lesson7;

import java.util.Locale;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("enter");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(text.toLowerCase());
    }
}
