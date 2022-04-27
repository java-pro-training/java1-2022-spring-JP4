package lv.lu.training.lesson3;

import java.util.Random;
//IESK
public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random randomNumberGenertor = new Random();
        int randomNumber1 = randomNumberGenertor.nextInt(3);
        int randomNumber2 = randomNumberGenertor.nextInt(7);
        int randomNumber3 = randomNumberGenertor.nextInt(9);
        System.out.println(randomNumber1 + randomNumber2 + randomNumber3);
    }
}
