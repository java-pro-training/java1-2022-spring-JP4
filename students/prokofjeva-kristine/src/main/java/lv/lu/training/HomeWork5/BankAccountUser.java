package lv.lu.training.HomeWork5;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class BankAccountUser {
    private static Scanner scanner;

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("20202020", "5555", 100, 300, 150);

        System.out.println("Enter your pin: ");
        Scanner scanner = new Scanner(System.in);

        int password = scanner.nextInt();
        if (password == 5555){
            System.out.println("Welcome! Enter 1 to deposit, Enter 2 to withdraw: ");

        } else {
            final boolean b = password <= 5555 || password >= 5555;
            System.out.println("Sorry, Pin is not correct. Try next time. ");return;}



            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Enter your pin: ");
                String pinCode = scanner.next();
                System.out.println("Enter amount to deposit: ");
                double amount = scanner.nextDouble();
                myAccount.topUp(pinCode, amount);
                System.out.println(myAccount);
            } else {
                final boolean c = choice ==2;
                System.out.println("Enter your pin: ");
                String pinCode = scanner.next();
                System.out.println("Enter amount to withdraw: ");
                double amount = scanner.nextDouble();
                myAccount.withDraw(pinCode, amount);
                System.out.println(myAccount);
            }


            }





}
