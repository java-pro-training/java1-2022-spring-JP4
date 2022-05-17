package lv.lu.training.lesson6;

import java.util.Random;

public class RollDice {

    public static void main(String[] args) {
        int sumOfWins = 0;
        rollDice();
        while (rollDice() != 12) {
            if ((rollDice() == 7) || (rollDice() == 11)) {
                sumOfWins++;
                System.out.println("Congratulations, you are the winner! You have won a total of " + sumOfWins + " times");
                rollDice();
            } else if ((rollDice() == 2) || (rollDice() == 3) || (rollDice() == 6)) {
                System.out.println("Unfortunately, you have lost. You have won a total of " + sumOfWins + " times");
                rollDice();
            } else {
                rollDice();
            }
        }
    }

    public static int rollDice() {
        Random random = new Random();
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;
        int result = dice1 + dice2;
        return result;
    }
}
