package lv.lu.training.HMW4;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write three numbers: ");

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        int greeatestNumber;

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            greeatestNumber = firstNumber;
        } else if (thirdNumber < secondNumber) {
            greeatestNumber = secondNumber;
        } else {
            greeatestNumber = thirdNumber;
        }
        System.out.println("Greatest Number is: " + greeatestNumber);
    }
}
