package lv.lu.training.lesson4;

import java.util.Random;

public class RollDice {
    public static void main(String[] args) {
        Random random = new Random();
        int dice1 = random.nextInt(6);
        int dice2 = random.nextInt(6);
        int result = dice1 + dice2 + 1;
        if ((result == 7) || (result == 11)) {
            System.out.println("You Win");
            System.out.println("You rolled a " + result);
        } else {
            System.out.println("You lost");
            System.out.println("You rolled a " + result);
        }
    }


}
