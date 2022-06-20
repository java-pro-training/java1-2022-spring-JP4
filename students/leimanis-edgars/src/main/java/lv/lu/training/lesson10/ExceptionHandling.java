package lv.lu.training.lesson10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {


    public static void main(String[] args) {


        try {
            System.out.println("User input " + getUserInput());
        } catch (InputMismatchException e) {
            System.out.println("Doh! Nepareizs simbols!");
        }
    }


    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter some integer: ");
        int value = scanner.nextInt();
        return value;

    }
}
