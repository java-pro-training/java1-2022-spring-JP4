package lv.lu.training.homework5;

import java.util.Scanner;

public class ATM {



    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BankAccount account = new BankAccount("12345", "1234", 100.0, 50.0, 0.0);

        System.out.println("Please enter pin code");
        String enteredPin = scanner.nextLine();
        if (enteredPin.equals(account.getPinCode())) {
            System.out.println("Pin code is correct");
            userChoiceSelect(scanner);
        } else {
            System.out.println("Wrong pin code");
        }
    }

    private static void userChoiceSelect(Scanner scanner) {
        System.out.println("What would you like to do?");
        System.out.println("Options: 1-withDraw; 2- topUp");
        String enteredOption = scanner.nextLine();
        switch (enteredOption) {
            case "1":
                System.out.println("You will withdraw funds");
                break;
            case "2":
                System.out.println("You will add funds");
                break;
        }
    }
}
