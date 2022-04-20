package lv.lu.training.lesson3;

import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {

        Random randomNumberGenerator = new Random();
        int numberOne = randomNumberGenerator.nextInt(0,100);
        int numberTwo = randomNumberGenerator.nextInt(0,100);
        int numberThree = randomNumberGenerator.nextInt(0,100);

        int sum = numberOne + numberTwo + numberThree;

        System.out.println(numberOne);
        System.out.println(numberTwo);
        System.out.println(numberThree);

        System.out.println("Summa ir" + sum);
    }
}
