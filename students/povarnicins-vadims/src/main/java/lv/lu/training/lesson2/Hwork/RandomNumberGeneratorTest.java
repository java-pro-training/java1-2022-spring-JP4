package lv.lu.training.lesson2.Hwork;

import java.util.Random;

public class RandomNumberGeneratorTest {
    public static void main(String[] args) {

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(1000000);

        System.out.println(randomNumber);
    }
}
