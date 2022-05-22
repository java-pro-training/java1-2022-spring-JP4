package lv.lu.training.homework4;

import java.util.Random;
//LABOT
public class RollDice {
    public static void main(String[] args) {
        Random random = new Random();
        int dice1 = random.nextInt(6); //šeit jāpanāk intervāls no 1-6, tgd ir intervāls no 0-5
        int dice2 = random.nextInt(6); //šeit jāpanāk intervāls no 1-6, tgd ir intervāls no 0-5

        int result = dice1 + dice2;

        if (result == 7 || result == 11) {
            System.out.println("You Won - result=" + result);
        } else {
            System.out.println("Sorry, you loose - result=" + result);
        }
    }
}
