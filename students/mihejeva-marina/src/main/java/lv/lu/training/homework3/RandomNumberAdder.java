package lv.lu.training.homework3;

import java.util.Random;

public class RandomNumberAdder {

    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();

        int randomIntOne = randomNumberGenerator.nextInt();
        int randomIntTwo = randomNumberGenerator.nextInt();
        int randomIntThree = randomNumberGenerator.nextInt();

        int randomSum = randomIntOne + randomIntTwo + randomIntThree;
        System.out.println("Random sum result = " + randomSum);
    }

}
