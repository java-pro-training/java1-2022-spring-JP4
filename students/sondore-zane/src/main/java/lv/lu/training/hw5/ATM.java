package lv.lu.training.hw5;

import java.util.Scanner;
//IESK
public class ATM {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankCard account = new BankCard("Swedbank", "MasterCard", "Zane", "45784364", "01/24", "604", "100.0");
        System.out.println("Please, enter PIN code");
        String enteredPin = scanner.nextLine();
        //  if (enteredPin.equals(account.getPinCode())) {
        System.out.println("PIN code is correct");
        userChoiceSelect();
        //   } else {
        System.out.println("Wrong PIN code");
    }

    private static void userChoiceSelect() {
        System.out.println("What do you like to do?");
        System.out.println("Options: 1- withdraw; 2-topUp");
        Scanner scanner = new Scanner(System.in);
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

