package lv.lu.training.HW3;

import java.util.Random;
//IESK
public class RandomNumberAdder {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();
        int randomNumber1 = randomNumberGenerator.nextInt(10);
        int randomNumber2 = randomNumberGenerator.nextInt(20);
        int randomNumber3 = randomNumberGenerator.nextInt(30);
        System.out.println(randomNumber1); //šī rindiņa nav nepieciešama, var izvadīt rezultātu uzreiz
        System.out.println(randomNumber2); //šī rindiņa nav nepieciešama, var izvadīt rezultātu uzreiz
        System.out.println(randomNumber3); //šī rindiņa nav nepieciešama, var izvadīt rezultātu uzreiz
        System.out.println(randomNumber1 + randomNumber2 + randomNumber3);
    }

}
