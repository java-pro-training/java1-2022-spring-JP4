package lv.lu.training.lesson3;

import java.util.Random;

public class RandomNumberAdder {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();
        int sum = randomNumberGenerator.nextInt(8) + randomNumberGenerator.nextInt(24) + randomNumberGenerator.nextInt(82);
        System.out.println(sum);
    }


}
