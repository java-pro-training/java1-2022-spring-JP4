package lv.lu.training.lesson5;

import java.util.Scanner;

public class AccountUser {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("5587459874", "1234", 100, 200, 0);
        System.out.println(myAccount);

        System.out.println("Enter operation, for topUp enter 1, for withdraw enter 2!");
        Scanner scanner = new Scanner(System.in);

        int operation = scanner.nextInt();
        if (operation == 1) {
            System.out.println("Enter pin!");
            String pin = scanner.next();
            System.out.println("Enter value!");
            double value = scanner.nextDouble();
            myAccount.topUp(pin,
                    value);
        } else {
            System.out.println("Enter pin!");
            String pin = scanner.next();
            System.out.println("Enter value!");
            double value = scanner.nextDouble();
            myAccount.withdraw(pin,
                    value);
        }
        System.out.println(myAccount);
    }
}
