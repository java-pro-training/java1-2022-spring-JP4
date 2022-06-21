package lv.lu.training.lesson2.lesson3.hw;

import java.util.Random;
//IESK
public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();
        int randomNumber1 = randomNumberGenerator.nextInt(4);
        int randomNumber2 = randomNumberGenerator.nextInt(9);
        int randomNumber3 = randomNumberGenerator.nextInt(2);
int result= randomNumber1+ randomNumber2+ randomNumber3;
        System.out.println(result);

    }
}
