package lv.lu.training.lesson10.HW2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeValidator {
    static Scanner ageScanner = new Scanner(System.in);
    static int age;
    static boolean number = true;

    public static int validateAge() {
        do {
            if (ageScanner.hasNextInt()) {
                age = ageScanner.nextInt();
                ageScanner.nextLine();
                number = false;
            } else {
                System.out.println("Please use numbers only");
                ageScanner.nextLine();
            }
        } while (number);
        return age;
    }

    private static boolean hasInvalidAge(int ageCheck) throws InputMismatchException {
        return ageCheck < Parameters.MIN_AGE.number || ageCheck > Parameters.MAX_AGE.number;
    }
}
