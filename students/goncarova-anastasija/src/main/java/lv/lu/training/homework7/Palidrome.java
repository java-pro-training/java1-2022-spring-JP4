package lv.lu.training.homework7;

import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args) {
        String x, y = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word to check: ");
        x = scanner.nextLine();
        int l = x.length();
        for (int k = l - 1; k >= 0; k--) {
            y = y + x.charAt(k);
        }
        if(x.equalsIgnoreCase(y)){
            System.out.println("Word is palidrome!");
        } else {
            System.out.println("String is not a palidrome!");
        }
    }
}

