package lv.lu.training.lesson4;

import java.util.Random;

//IESK
public class RollTheDice {

    public static void main(String[] args) {
//        int dice1;
//        int dice2;
        Random random = new Random();
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;
        int result = dice1 + dice2;
        if (result == 2 || result == 3 || result == 4 || result == 5 || result == 6 || result == 8 || result == 9 || result == 10 || result == 12) {
            System.out.println("Sorry, You are a looser " + result);
        } else  {
            System.out.println("Congratilations, You are a winner " + result);
        }


    }
}
