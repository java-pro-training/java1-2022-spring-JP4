package lv.lu.training.homeWork3;

import java.util.Random;

//IESK
public class RandomNumberAdder {

    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();
        int randomNumber1 = randomNumberGenerator.nextInt(10);
        int randomNumber2 = randomNumberGenerator.nextInt(10);
        int randomNumber3 = randomNumberGenerator.nextInt(10);
        System.out.println(randomNumber1); //šī rindiņā nav nepieciešama
        System.out.println(randomNumber2); //šī rindiņā nav nepieciešama
        System.out.println(randomNumber3); //šī rindiņā nav nepieciešama
        System.out.println(randomNumber1 + randomNumber2 + randomNumber3);


    }

}
