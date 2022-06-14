package lv.lu.training.homework6;

import java.util.Scanner;
//IESK
public class GetUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 2 whole numbers: ");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        OddNumberLookup oddNumberLookup = new OddNumberLookup();
        oddNumberLookup.printOddWithin(firstNumber, secondNumber);

    }
}
