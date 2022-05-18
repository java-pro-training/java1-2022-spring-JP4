package lv.lu.training.homework6;

import java.util.Random;

public class RollDice {
    public static void main(String[] args) {

        int diceSum = 0;
        int sumOfWins = 0;
        int sumOfLosses = 0;
        while(diceSum != 12) {
            sumOfLosses++;
            Random random = new Random();
            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;

            diceSum = dice1 + dice2;

            if (diceSum == 7 || diceSum == 11) {
                sumOfWins++;
                System.out.println("You Won  - result = " + diceSum);
            } else if (diceSum == 2 || diceSum == 3 || diceSum == 6) {
                sumOfLosses++;
                System.out.println("You Lost - result = " + diceSum);
            }

        }

        System.out.println("Count of wins = " + sumOfWins);
        System.out.println("Count of losses = " + sumOfLosses);

    }
}
