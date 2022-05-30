package lv.lu.training.homework4;

import java.util.Scanner;
//LABOT
//pārbaudīt loģiku, ja ievada 3,3,2
public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 3 whole numbers: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
            System.out.println("The biggest is firstNumber (" + firstNumber + ")");
        } else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber)) {
            System.out.println("The biggest is secondNumber (" + secondNumber + ")");
        } else {
            System.out.println("The biggest is thirdNumber (" + thirdNumber + ")");
        }
    }
}
