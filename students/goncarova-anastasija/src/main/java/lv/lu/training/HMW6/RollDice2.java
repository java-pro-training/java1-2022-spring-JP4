package lv.lu.training.HMW6;

import java.util.Random;

public class RollDice2 {



    public static void main(String[] args) {
        rollDice();
        int result = rollDice();
        int sumOfWin = 0;
        while (rollDice() != 12) ; {
            if (result == 7 || result == 11) {
                sumOfWin++;
                System.out.println("Result: " + result + "! Winner! You won: " + sumOfWin);
                rollDice();
            } else if (result == 2 || result == 3 || result == 6) {
                System.out.println("Result: " + result +  "! Looser! You won: " + sumOfWin);
                rollDice();
            } else {
                System.out.println("Result: " + result +  " ! Roll one more time! You won: " + sumOfWin);
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