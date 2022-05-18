package lv.lu.training.HW4;

import java.util.Scanner;
//LABOT
//pārbaudīt zem if nosacījumiem, jums jāizmanto else if būtu, kā arī AND rakstās ar divim && nevis vienu &
//ievadiet pārbaudēs 3,3,2, nebūs izvades
public class GreatestOfThree {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number");
        int firstNumber = scan.nextInt();
        System.out.println("Enter the second number");
        int secondNumber = scan.nextInt();
        System.out.println("Enter the third number");
        int thirdNumber = scan.nextInt();

        if (firstNumber>secondNumber & firstNumber>thirdNumber)
        {
            System.out.println("First number is the greatest number " + firstNumber);
        }
        if (secondNumber>firstNumber && secondNumber>thirdNumber)
        {
            System.out.println("Second number is the greatest number " + secondNumber);
        }
        if (thirdNumber>firstNumber && thirdNumber>secondNumber) {
            System.out.println("Third number is the greatest number " + thirdNumber);
        }
    }
}


