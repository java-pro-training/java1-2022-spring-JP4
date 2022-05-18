package lv.lu.training.lesson6;

import java.util.Random;

public class RollDice2 {
    public static void main(String[] args) {
        int dice1;
        int dice2;

        Random random = new Random();

        int sumOfWins = 0;
        int sumOfLoses = 0;
        int diceSum = 0;

        while (diceSum != 12) {

            dice1 = random.nextInt(6) + 1;
            dice2 = random.nextInt(6) + 1;

            diceSum = dice1 + dice2;

            if (diceSum == 7 || diceSum == 11) {
                sumOfWins++;
                System.out.println("The game is won!");
                System.out.println("Number of games won is " + sumOfWins);
                System.out.println("Number of games lost is " + sumOfLoses);
            } else if (diceSum == 2 || diceSum == 3 || diceSum == 6) {
                sumOfLoses++;
                System.out.println("The game is lost!");
                System.out.println("Number of games won is " + sumOfWins);
                System.out.println("Number of games lost is " + sumOfLoses);
            }
        }
    }
}
