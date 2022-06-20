package lv.lu.training.lesson10.HW2;

import java.util.Scanner;

public class NameValidator {


    public static String validateName() {
        Scanner nameScanner = new Scanner(System.in);
        String name;
        boolean number = true;
        do {
            if (nameScanner.hasNextInt()) {
                System.out.println("Please use letters only");
                System.out.println("Please enter your name:");
                name = nameScanner.nextLine();
            } else if (nameScanner.hasNextLine()) {
                name = nameScanner.nextLine();
                if (hasInvalidLength(name)) {
                    System.out.println("Name and Surname have to be 3 to 15 characters. Please try again.");
                    System.out.println("Please enter your name:");
                } else {
                    number = false;
                }
            } else {
                name = nameScanner.nextLine();
                number = false;
            }
        } while (number);
        System.out.println("Thanks you!");
        return name;
    }

    private static boolean hasInvalidLength(String text) {
        return text.length() < Parameters.MIN_TEXT_LENGTH.number || text.length() > Parameters.MAX_TEXT_LENGTH.number;
    }
}





