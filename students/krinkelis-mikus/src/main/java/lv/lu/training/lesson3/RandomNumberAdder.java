package lv.lu.training.lesson3;

import java.util.Random;
//IESK
public class RandomNumberAdder {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();
        int numberOne = randomNumberGenerator.nextInt(50);
        int numberTwo = randomNumberGenerator.nextInt(75);
        int numberThree = randomNumberGenerator.nextInt(100);
        int sum = numberOne + numberTwo + numberThree;

        System.out.println(numberOne); //šī rindiņa nav nepieciešama
        System.out.println(numberTwo); //šī rindiņa nav nepieciešama
        System.out.println(numberThree); //šī rindiņa nav nepieciešama
        System.out.println("Random number sum " + sum);





    }
}
