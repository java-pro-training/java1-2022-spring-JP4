package lv.lu.training.homework4;

// Man nesanca, godigi es nesaprotu(((

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write three numbers");

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("firstNumber is greatestNumber");
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("secondNumber is greatestNumber");
        } else {
            System.out.println("thirdNumber is greatestNumber");
        }

    }

}
