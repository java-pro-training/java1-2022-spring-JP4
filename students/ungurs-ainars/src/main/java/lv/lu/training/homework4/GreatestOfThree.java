package lv.lu.training.homework4;

import java.util.Scanner;
//IESK
public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write three whole numbers!");

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        int greatestNumber;

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            greatestNumber = firstNumber;
        } else if (secondNumber > thirdNumber) {
            greatestNumber = secondNumber;
        } else {
            greatestNumber = thirdNumber;
        }
        System.out.println("Greatest number is " + greatestNumber);
    }
}