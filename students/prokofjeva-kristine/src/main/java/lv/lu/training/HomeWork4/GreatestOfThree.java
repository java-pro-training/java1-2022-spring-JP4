package lv.lu.training.HomeWork4;

import java.util.Scanner;

//IESK
public class GreatestOfThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number. ");
        int a = scanner.nextInt(); //labāk lietot mainīgos ar paskaidrojošu būtību
        System.out.println("Enter the second number. ");
        int b = scanner.nextInt(); //labāk lietot mainīgos ar paskaidrojošu būtību
        System.out.println("Enter the third number. ");
        int c = scanner.nextInt(); //labāk lietot mainīgos ar paskaidrojošu būtību


        if (a >= b && a >= c) {
            System.out.println(a + " is the greatest number. ");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the greatest number. ");
        } else {
            System.out.println(c + " the greatest number. ");


        }

    }
}
