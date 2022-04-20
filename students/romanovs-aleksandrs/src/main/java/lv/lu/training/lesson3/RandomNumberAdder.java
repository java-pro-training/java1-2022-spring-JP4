package lv.lu.training.lesson3;

import java.util.Random;

public class RandomNumberAdder {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();
        int randomNumber1 = randomNumberGenerator.nextInt(3);
        int randomNumber2 = randomNumberGenerator.nextInt(7);
        int randomNumber3 = randomNumberGenerator.nextInt(9);
        System.out.println(randomNumber1 + randomNumber2 + randomNumber3);
    }
}
