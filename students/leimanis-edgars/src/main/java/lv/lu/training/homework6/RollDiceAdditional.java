package lv.lu.training.homework6;

import java.util.Random;

public class RollDiceAdditional {

    public static void main(String[] args) {
        Random dice = new Random();
        int dice1 = dice.nextInt(6) + 1;
        int dice2 = dice.nextInt(6) + 1;
        int sum = dice1 + dice2;
        int sumOfWins = 0;
        int sumOfLost = 0;

        while (sum != 12) {
            if (sum == 7 || sum == 11) {
                sumOfWins++;

                System.out.println("Apsveicu, ar " + sum + " Jus uzvarejat!!!");
            }

            if (sum == 2 || sum == 3 || sum == 6) {
                sumOfLost++;

                System.out.println("Diemzel ar " + sum + " Jus zaudejat :(");
            }

//
        }
    }
}
