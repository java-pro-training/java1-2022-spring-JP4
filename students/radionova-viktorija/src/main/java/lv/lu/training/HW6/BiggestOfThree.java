package lv.lu.training.HW6;

import java.util.Scanner;
//IESK
public class BiggestOfThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biggest = 0;

        for (int i = 3; i > 0; i--) {
            System.out.println("Enter the number: ");
            int number = scanner.nextInt();
            if (number > biggest) {
                biggest = number;
            }
        }

        System.out.println("Biggest number is: " + biggest);
    }
}

