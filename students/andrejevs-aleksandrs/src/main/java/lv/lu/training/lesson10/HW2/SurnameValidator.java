package lv.lu.training.lesson10.HW2;

import java.util.Scanner;

public class SurnameValidator {
    public static String validateSurname() {
        Scanner surnameScanner = new Scanner(System.in);
        String surname;
        boolean number = true;
        do {
            if (surnameScanner.hasNextInt()) {
                System.out.println("Please use letters only");
                System.out.println("Please enter your surname:");
                surname = surnameScanner.nextLine();
            } else if (surnameScanner.hasNextLine()) {
                surname = surnameScanner.nextLine();
                if (hasInvalidLength(surname)) {
                    System.out.println("Name and Surname have to be 3 to 15 characters. Please try again.");
                    System.out.println("Please enter your surname:");
                } else {
                    number = false;
                }
            } else {
                surname = surnameScanner.nextLine();
                number = false;
            }
        } while (number);
        System.out.println("Thanks you!");
        return surname;
    }

    private static boolean hasInvalidLength(String text) {
        return text.length() < Parameters.MIN_TEXT_LENGTH.number || text.length() > Parameters.MAX_TEXT_LENGTH.number;
    }
}
