package lv.lu.training.lesson4;

import java.util.Scanner;
//IESK
public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Please enter third number:");
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("First number is the largest!");
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("Second number is the largest!");
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println("Third number is the largest!");
        } else {
            System.out.println("Oops! Some numbers are the same");
        }


    }
}
