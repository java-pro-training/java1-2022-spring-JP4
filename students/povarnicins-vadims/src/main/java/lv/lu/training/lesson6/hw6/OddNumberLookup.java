package lv.lu.training.lesson6.hw6;

import java.util.Scanner;
//IESK
public class OddNumberLookup {


    public static void main(String[] args) {

        Scanner userEntry = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = userEntry.nextInt();
        System.out.println("Enter second number");
        int secondNumber = userEntry.nextInt();
        System.out.println("Odd numbers are:");


        new OddNumberLookup();
        for (int i = firstNumber; i <= secondNumber; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }

        }

    }

}







