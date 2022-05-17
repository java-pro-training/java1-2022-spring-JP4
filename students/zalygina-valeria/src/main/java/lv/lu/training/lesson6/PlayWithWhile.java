package lv.lu.training.lesson6;

import java.util.Scanner;

public class PlayWithWhile {

    public static void main(String[] args) {
        //simpleWhile();
        interestingExample();
    }


    public static void simpleWhile() {
        int i = 10;
        while (i > 5) {
            System.out.println(i + "-this number is greater than 5");
            i--;
        }
    }

    private static void interestingExample() {
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter some positive number");
        int number = scanner.nextInt();

        while (number >= 0) {
            sum += number;
            System.out.println("Enter number");
            number = scanner.nextInt();
        }
        System.out.println("Sum = " + sum);
        scanner.close();

    }
}
k
