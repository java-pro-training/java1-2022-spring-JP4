package lv.lu.training.lesson3;

import java.util.Random;
//IESK

public class RandomNumberAdder {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();
        int randomNumber1 = randomNumberGenerator.nextInt();
        int randomNumber2 = randomNumberGenerator.nextInt();
        int randomNumber3 = randomNumberGenerator.nextInt();
        System.out.println(randomNumber1); //šī rindiņa nav nepieciešama
        System.out.println(randomNumber2); //šī rindiņa nav nepieciešama
        System.out.println(randomNumber3); //šī rindiņa nav nepieciešama
        System.out.println(randomNumber1 + randomNumber2 + randomNumber3);

    }
}
