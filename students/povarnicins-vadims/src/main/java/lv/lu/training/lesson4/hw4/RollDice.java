package lv.lu.training.lesson4.hw4;

import java.util.Random;

public class RollDice {
    public static void main(String[] args) {

        Random diceRandom = new Random();

        int dice1 = diceRandom.nextInt(6) + 1;
        int dice2 = diceRandom.nextInt(6) + 1;
        int result = dice1 + dice2;

        if (result == 7 || result == 11) {
            System.out.println("You win!");

        } else {
            System.out.println("Game over!");
        }


    }
}
