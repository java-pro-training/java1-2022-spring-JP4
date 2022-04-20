package lv.lu.training.lesson3;

import java.util.Random;

public class RandomNumberAdder {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();
        int sum = randomNumberGenerator.nextInt(11) + randomNumberGenerator.nextInt(51) + randomNumberGenerator.nextInt(101);
        System.out.println(sum);

    }
}
