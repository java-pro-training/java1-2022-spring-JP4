package lv.lu.training.lesson2;

import java.util.Random;

//IESK
public class RandomNumberGenerator {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(101);
        System.out.println(randomNumber);
    }
}
