package lv.lu.training.HomeWork4;

import java.util.Random;
import java.util.Scanner;

public class NewRollDice {
    public static void main(String[] args) {
        Random random = new Random();


        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;
        int result = dice1 + dice2;


        System.out.println("dice1: " + dice1);
        System.out.println("dice2: " + dice2);
        System.out.println("result: " + result);


        if (result == 2 || result == 3 || result == 4 || result == 5 || result == 6 || result == 8 || result == 9 || result == 10 || result == 12) {
            System.out.println("You lose! ");
        }
        if (result == 7 || result == 11) {
            System.out.println("You win! ");
        }
    }


}


