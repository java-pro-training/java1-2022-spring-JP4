package lv.lu.training.lesson4.hw4;


import java.util.Scanner;
//IESK
public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st number");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter 2nd number");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter 3rd number");
        int thirdNumber = scanner.nextInt();

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println("Greatest Number " + firstNumber);
        } else if (firstNumber <= secondNumber && secondNumber >= thirdNumber) {
            System.out.println("Greatest Number " + secondNumber);
        } else {
            System.out.println("Greatest Number " + thirdNumber);
        }

    }
}
