package lv.lu.training.HW5;

import java.util.Scanner;

public class ATM {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount("12345", "1234", 100.0, 50.0, 0.0);
        System.out.println("Please enter pin code");
        String enteredPin = scanner.nextLine();
        if (enteredPin.equals(account.getPinCode())) {
            System.out.println("Pin code is correct");
            userChoiseSelect(scanner);
        } else {
            System.out.println("Wrong pin code");
        }
    }

    private static void userChoiseSelect(Scanner scanner) {
        System.out.println("What do you like to do?");
        System.out.println("Options: 1- whitDraw; 2-topUp");
        String enteredOption = scanner.nextLine();
        switch (enteredOption) {
            case "1":
                System.out.println("You will whitDraw funds");
                break;
            case "2":
                System.out.println("You will add founds");
                break;

        }
    }
}
