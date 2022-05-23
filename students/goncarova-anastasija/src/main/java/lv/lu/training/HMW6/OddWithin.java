package lv.lu.training.HMW6;

import java.util.Scanner;

public class OddWithin {
    public OddWithin(int firstNumber, int secondNumber) {
        int n = secondNumber;
        for (int i = firstNumber; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        OddWithin oddWithin = new OddWithin(firstNumber, secondNumber);

    }

}

