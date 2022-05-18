package lv.lu.training.HW4;

import java.util.Random;
//IESK
public class RollDice {
    public static void main(String[] args) {
        Random random = new Random();


        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;
        int result = dice1 + dice2;

        System.out.println("Dice1: " + dice1);
        System.out.println("Dice2: " + dice2);
        System.out.println("Total: " + result);

        if (result == 7 || result == 11) {
            System.out.println("You Win!");
        }
        if (result == 2 || result == 3 || result == 4 || result == 5 || result == 6 || result == 8 || result == 9 || result == 10)
            //Varēja īsāk, izmantojot ar else
            System.out.println("You Lose!");
        {
        }
    }


}
