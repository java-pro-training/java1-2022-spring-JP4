package lv.lu.training.HW4;

import java.util.Scanner;
//LABOT
//ievadiet pārbaudēs 3,3,2, nebūs pareiza izvade
public class SecondAtemptGOT {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number");
        int x = scan.nextInt(); //izmantojat paskaidrojošus mainīgos
        System.out.println("Enter the second number");
        int y = scan.nextInt(); //izmantojat paskaidrojošus mainīgos
        System.out.println("Enter the third number");
        int z = scan.nextInt(); //izmantojat paskaidrojošus mainīgos

        if (x > y && x > z) {
            System.out.println("First number is the greatest number " + x);
        } else if (y > x && y > z) {
            System.out.println("Second number is the greatest number " + y);
        } else {
            System.out.println("Third number is the greatest number " + z);
        }
    }
}
