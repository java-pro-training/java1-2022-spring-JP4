package lv.lu.training.hw4;

import java.util.Random;

//IESK
public class RollDice {
    public static void main(String[] args) {
        Random random = new Random();

        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;
        int result = dice1 + dice2;
        if ((result == 7) || (result == 11)) {
            System.out.println("Congratulations, you are the winner!");
        } else {
            System.out.println("Unfortunately you lost. Better luck next time!");
        }
    }
}
