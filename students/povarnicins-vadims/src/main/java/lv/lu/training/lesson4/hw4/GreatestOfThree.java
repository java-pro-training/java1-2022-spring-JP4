package lv.lu.training.lesson4.hw4;

import java.util.Scanner;

//LABOT
//Pārbaudiet loģiku, ja ievada 3,3,2 skaitļus

//Labots
public class GreatestOfThree {
    public static void main(String[] args) {

        Scanner userNumber = new Scanner(System.in);
        System.out.println("Enter three random numbers:");

        int firstNumber = userNumber.nextInt();
        int secondNumber = userNumber.nextInt();
        int thirdNumber = userNumber.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("Greatest is first number - " + firstNumber + "!");

        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("Greatest is second number - " + secondNumber + "!");

        } else if (thirdNumber > secondNumber && thirdNumber > firstNumber) {
            System.out.println("Greatest is third number - " + thirdNumber + "!");

        } else {
            System.out.println("Some numbers are the same, enter different numbers!");

        }


    }
}
