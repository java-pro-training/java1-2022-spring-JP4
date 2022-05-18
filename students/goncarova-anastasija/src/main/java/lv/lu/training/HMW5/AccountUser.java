package lv.lu.training.HMW5;

import java.util.Scanner;
//IESK
public class AccountUser {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("49526487516", "5886", 100, 200, 0);
        System.out.println(myAccount);

        System.out.println("Enter operation: For topUp enter 1; For withdraw enter 2");
        Scanner scanner = new Scanner(System.in);

        int operation = scanner.nextInt();
        if (operation == 1) {
            System.out.println("Enter pin:");
            String pin = scanner.next();
            System.out.println("Enter amount:");
            double amount = scanner.nextDouble();
            myAccount.topUp(pin, amount);
        } else {
            System.out.println("Enter pin:");
            String pin = scanner.next();
            System.out.println("Enter amount:");
            double amount = scanner.nextDouble();
            myAccount.withdraw(pin, amount);
        }
        System.out.println(myAccount);
    }
}
