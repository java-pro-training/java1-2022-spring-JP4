package lv.lu.training.lesson6.hw6;

import java.util.Random;
//IESK
public class RollDice2 {

    public static void main(String[] args) {

        Random diceRandom = new Random();

        int sumOfWins = 0;
        int sumOfLoss = 0;
        int totalGames = 0;
        int diceSum;

        do {
            int dice1 = diceRandom.nextInt(6) + 1;
            int dice2 = diceRandom.nextInt(6) + 1;
            diceSum = dice1 + dice2;

            if (diceSum == 7 || diceSum == 11) {
                sumOfWins++;
                totalGames++;
                System.out.println("Wins " + sumOfWins);

            } else if (diceSum == 2 || diceSum == 3 || diceSum == 6) {
                sumOfLoss++;
                totalGames++;
                System.out.println("Losses " + sumOfLoss);

            } else {
                totalGames++;

            }

        } while (diceSum != 12);
        {
            System.out.println("_________________________________");
            System.out.println("The game is over, dice sum is 12!");
            System.out.println("Games won - " + sumOfWins + "!");
            System.out.println("Games lost - " + sumOfLoss + "!");
            System.out.println("Total games - " + totalGames + "!");
        }
    }
}

