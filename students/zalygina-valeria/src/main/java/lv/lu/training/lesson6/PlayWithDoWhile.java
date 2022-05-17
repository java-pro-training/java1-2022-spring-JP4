package lv.lu.training.lesson6;

import java.util.Scanner;

public class PlayWithDoWhile {

    public static void main(String[] args) {
       // simpleDoWhile();
        otherDoWhileExample();
    }
    private static void otherDoWhileExample() {
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            sum += number;
            System.out.println("Please, enter some number");
            number = scanner.nextInt();
        }while (number>=0);
        System.out.println("Sum= "+ sum);
        scanner.close();
    }


    private static void simpleDoWhile() {
        int i = 1;
        int n = 5;
        
        do {
            System.out.println(i);
            i++;
        } while (i <= n);
    }
}
