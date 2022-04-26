package lv.lu.training.lesson4;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number...");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter the second number...");
        int secondNumber = scanner.nextInt();
        System.out.println("Please enter the third number...");
        int thirdNumber = scanner.nextInt();
        if ((firstNumber >= secondNumber) && (firstNumber >= thirdNumber)) {
            System.out.println(secondNumber);
        } else if ((secondNumber >= firstNumber) && (secondNumber >= thirdNumber)) {
            System.out.println(secondNumber);
        } else {
            System.out.println(thirdNumber);
        }

    }
}
