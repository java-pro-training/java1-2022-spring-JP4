package lv.lu.training.HW3;

import java.util.Random;

public class RandomNumberAdder {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();
        int randomNumber1 = randomNumberGenerator.nextInt(10);
        int randomNumber2 = randomNumberGenerator.nextInt(20);
        int randomNumber3 = randomNumberGenerator.nextInt(30);
        System.out.println(randomNumber1);
        System.out.println(randomNumber2);
        System.out.println(randomNumber3);
        System.out.println(randomNumber1 + randomNumber2 + randomNumber3);
    }

}
