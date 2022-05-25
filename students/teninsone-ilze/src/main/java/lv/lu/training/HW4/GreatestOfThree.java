package lv.lu.training.HW4;

import java.util.Scanner;
//LABOT
//kļūda loģikā, ievadie 3,3,2 un būs nekorekts rezultāts
public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write 3 numbers");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)) {
            System.out.println("first number is the largest number");
        } else if ((secondNumber > thirdNumber) && (secondNumber > firstNumber)) {
            System.out.println("second number is the largest number");
        } else {
            System.out.println("third number is the largest number");
        }
    }
}
