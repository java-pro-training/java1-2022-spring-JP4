package lv.lu.training.HomeWork6;

import java.util.Scanner;
//IESK
public class PrintOddWithin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please,enter first number ");
        int firstNumber = scanner.nextInt();

        System.out.println("Please, enter second number ");
        int secondNumber = scanner.nextInt();


        OddNumberLookUp oddNumberLookUp = new OddNumberLookUp(firstNumber, secondNumber);


    }

}
