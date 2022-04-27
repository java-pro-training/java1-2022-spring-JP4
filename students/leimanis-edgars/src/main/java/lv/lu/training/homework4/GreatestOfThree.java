package lv.lu.training.homework4;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber & firstNumber > thirdNumber) {
            System.out.println(firstNumber + " sis skaitlis ir lielakais!");
        } else if (secondNumber > firstNumber & secondNumber > thirdNumber) {
            System.out.println(secondNumber + " sis skaitlis ir lielakais!");
        } else {
            System.out.println(thirdNumber + " sis skaitlis ir lielakais!");
        }
    }
}
