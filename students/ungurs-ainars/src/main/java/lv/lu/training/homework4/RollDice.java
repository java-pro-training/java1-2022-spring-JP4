package lv.lu.training.homework4;

import java.util.Random;
//IESK
public class RollDice {
    public static void main(String[] args) {
        int dice1;
        int dice2;

        Random random = new Random();

        dice1 = random.nextInt(6) + 1;
        dice2 = random.nextInt(6) + 1;

        int result = dice1 + dice2;

        System.out.println("Rolled " + dice1 + " and " + dice2);
        System.out.println("Sum of two dice is " + result);

        if (result == 7 || result == 11) {
            System.out.println("The game is won!");
        } else {
            System.out.println("The game is lost!");
        }
    }
}
