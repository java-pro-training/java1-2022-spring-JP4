package lv.lu.training.lesson6;

import java.util.Scanner;

import static lv.lu.training.lesson6.OddNumberLookup.printOddWithin;

public class OddNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write two numbers from and to!");

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        printOddWithin(firstNumber, secondNumber);
    }
}
