package lv.lu.training.md4;

import java.util.Random;

public class RollDice {
    public static void main(String[] args) {
        Random ran = new Random();
        int dice1 = ran.nextInt(7)+1;
        int dice2 = ran.nextInt(7)+1;
        int result = dice1 + dice2;
       // System.out.println("Result is :" ++dice1 + dice1);



    }
}
