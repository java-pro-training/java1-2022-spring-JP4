package lv.lu.training.lesson6.HW6;

import java.util.Scanner;

public class OddNumberPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Please, enter the second number");
        int secondNumber = scanner.nextInt();
        OddNumberLookup oddNumberLookup = new OddNumberLookup(firstNumber, secondNumber);
    }
}
