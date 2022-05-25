package lv.lu.training.HW5;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("45612376871298", "1234", 100.0, 50.0, 0.0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter pincode: ");
        String enteredPin = scanner.nextLine();
        if (enteredPin.equals(account.getPinCode())) {
            System.out.println("Pincode is correct");
            userChoiceSelect();
        } else {
            System.out.println("Wrong Pin");
        }
    }

    private static void userChoiceSelect() {
        System.out.println("Wahat would you like to do?");
        System.out.println("Option one: Withdraw; Option two: TopUp");
        Scanner scanner = new Scanner(System.in);
        String enteredOption = scanner.nextLine();
        switch (enteredOption) {
            case "1":
                System.out.println(" You will withdaw funds");
                break;
            case "2":
                System.out.println("You will add funds");
                break;
        }
    }
}

