package lv.lu.training.homework4;

import java.util.Random;
//LABOT
//pārbaudiet nextInt metodi. Ja izmanto java8, tad tur eksistē nextInt ar vienu parametru tikai
public class RollDice {
    public static void main(String[] args) {
        Random rollDice = new Random();
        int dicel1 = rollDice.nextInt(1, 6);
        int dicel2 = rollDice.nextInt(1, 6);
        int result = dicel1 + dicel2;

        System.out.println(dicel1 + dicel2);

        if (result == 7 || result == 11) {
            System.out.println("spēle ir vinnēta");
        } else {
            System.out.println("spēle ir zaudēta");
        }
    }
}
