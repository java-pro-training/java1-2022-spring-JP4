package lv.lu.training.HMW4;

import java.util.Random;
//IESK
public class RollDice {
    public static void main(String[] args) {

        Random random = new Random();

        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;
        int result = dice1 + dice2;

        System.out.println("First number: " + dice1);
        System.out.println("Second number: " + dice2);
        System.out.println("Result: " + result);

        if (result == 7 || result == 11) {
            System.out.println("Winner!");
        } else {
            System.out.println("Looser!");
        }

    }
}
