package lv.lu.training.lesson6;

import java.util.Random;
//IESK
public class RollDice {
    public static void main(String[] args) {

        Random random = new Random();

        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;

        int diceSum = dice1 + dice2;
        int sumOfWins = 0;
        int sumOfLoose = 0;

        while (diceSum != 12) {
            if (diceSum == 7 || diceSum == 11) {
                sumOfWins++;

                System.out.println("you win");
            }
            if (diceSum == 2 || diceSum == 3 || diceSum == 6) {
                sumOfLoose++;
                System.out.println("You Loose");
            }
            dice1 = random.nextInt(6) + 1;
            dice2 = random.nextInt(6) + 1;
            diceSum = dice1 + dice2;
        }
        System.out.println("Wins: " + sumOfWins + " and losses: " + sumOfLoose);
    }
}

