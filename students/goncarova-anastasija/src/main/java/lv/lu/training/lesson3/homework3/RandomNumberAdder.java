package lv.lu.training.lesson3.homework3;

import java.util.Random;
//IESK
public class RandomNumberAdder {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();
        int sum = randomNumberGenerator.nextInt(15) + randomNumberGenerator.nextInt(50) + randomNumberGenerator.nextInt(105);
        System.out.println(sum);
    }

}

