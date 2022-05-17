package lv.lu.training.homework4;

import java.util.Random;
//IESK
public class RollDice {
    public static void main(String[] args) {
        Random dice = new Random();
        int dice1 = dice.nextInt(6) + 1;
        int dice2 = dice.nextInt(6) + 1;
        int sum = dice1 + dice2;

        if (sum == 2 || sum == 3 || sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10 || sum == 12) { //Lai pieraksti būtu īsāks, var baudīt vai nav 7 vai 11 un else nosacījumā nelikt ciparus
            System.out.println("Diemzel ar " + sum + " Jus zaudejat :(");
        } else if (sum == 7 || sum == 11) {
            System.out.println("Apsveicu, ar " + sum + " Jus uzvarejat!!!");

        }
    }
}
