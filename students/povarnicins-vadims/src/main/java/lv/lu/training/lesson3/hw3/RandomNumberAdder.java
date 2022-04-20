package lv.lu.training.lesson3.hw3;

import java.util.Random;

public class RandomNumberAdder {
    public static void main(String[] args) {

        Random randomNumberGenerator = new Random();
        int randomNumber1 = randomNumberGenerator.nextInt(10);
        int randomNumber2 = randomNumberGenerator.nextInt(10);
        int randomNumber3 = randomNumberGenerator.nextInt(10);

        int valueOne = randomNumber1;
        int valueTwo = randomNumber2;
        int valueThree = randomNumber3;

        System.out.println("Random Nr1: " + valueOne);
        System.out.println("Random Nr2: " + valueTwo);
        System.out.println("Random Nr3: " + valueThree);

        int resultFromFirstMethod = sumValues(valueOne, valueTwo);
        printResult(resultFromFirstMethod);

        int resultFromSecondMethod = subtractValues(resultFromFirstMethod, randomNumber3);
        printResult(resultFromSecondMethod);

    }

    public static int sumValues(int valueOne, int valueTwo) {
        return valueOne + valueTwo;

    }

    public static int subtractValues(int resultFromFirstMethod, int valueThree) {
        return resultFromFirstMethod + valueThree;

    }

    public static void printResult(int result) {

        System.out.println(result);
    }


}
