package lv.lu.training.lesson2.lesson6;

import java.util.Scanner;

public class GreatestFromThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, insert first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Please, insert second number");
        int secondNumber = scanner.nextInt();
        System.out.println("Please, insert third number");
        int thirdNumber = scanner.nextInt();
        if ((firstNumber > secondNumber) && (firstNumber > secondNumber)) {
            System.out.println("First number:" + firstNumber + " " + " is greatest of three ");

        } else if ((secondNumber > firstNumber) && (secondNumber > thirdNumber)) {
            System.out.println("Second Number:" + secondNumber + "" + " is greatest of three");
        } else {
            System.out.println("Third number:" + thirdNumber + "" + " is greatest of three");
        }
    }
}

