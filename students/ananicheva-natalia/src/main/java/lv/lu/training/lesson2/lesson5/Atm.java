package lv.lu.training.lesson2.lesson5;

import java.util.Scanner;

public class Atm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount1 account1 = new BankAccount1("12345687", 100d, 200d, 0d, "1234");
        System.out.println("Please, enter PIN code");
        String enteredPin = scanner.nextLine();

        if (enteredPin.equals(account1.getPinCode())) {
            System.out.println("Entered PIN code is correct");
            userChoiceSelect(scanner);
        } else {
            System.out.println("PIN code is not correct");
        }
        account1.topUp(300d);
        account1.withDraw(150d);
        System.out.println(account1);
    }


    private static void userChoiceSelect(Scanner scanner) {
        System.out.println("Options: press 1- to withdraw money; press 2- to top up money");

        String enteredOption = scanner.nextLine();
        switch (enteredOption) {
            case "1":
                System.out.println("You are going to withdraw money");

                break;
            case "2":
                System.out.println("You are going to top up money");
                break;
        }
    }

}





