package lv.lu.training.HomeWork4;

import java.util.Random;
import java.util.Scanner;

public class RollDice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the dice roll count: ");
        int numberOfDice = input.nextInt();
        if (numberOfDice == 0) {
            System.out.println("Input rollcount is 0" + "\n" + "Number of dice incremented to 1.");
            numberOfDice++;

        }
        diceRolled(numberOfDice);
        input.close();

    }


    public static void diceRolled(int a) {
        int dice;
        int result = 0;
        int total = 0;
        Random randomObj = new Random();
        System.out.println("Dice rolled : ");
        for (dice = 1; dice <= a; dice++) {
            result = randomObj.nextInt(6) + 1;
            total += result;

        }

        System.out.println(result + " ");

        System.out.println("\n" + "Total = " + total);


            if (total == 1 || total == 2 || total == 3 || total == 4 || total == 5 || total == 6 || total == 8 || total == 9 || total == 10 || total == 12) {
                System.out.println("You lose! ");}

                if (total == 7 || total == 11) {
                    System.out.println("You win! ");

            }
        }



    }


