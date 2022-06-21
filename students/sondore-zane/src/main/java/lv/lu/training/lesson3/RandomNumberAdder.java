package lv.lu.training.lesson3;

import java.util.Random;

//LABOT
public class RandomNumberAdder {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();
        int numberOne = randomNumberGenerator.nextInt(0, 100); //jāģenerē random cipari no Random objekta ar metodes nextInt palīdzību, jūsu gadījumā tas būs randomNumberGenerator
        int numberTwo = randomNumberGenerator.nextInt(0, 100); //jāģenerē random cipari no Random objekta ar metodes nextInt palīdzību, jūsu gadījumā tas būs randomNumberGenerator
        int numberThree = randomNumberGenerator.nextInt(0, 100); //jāģenerē random cipari no Random objekta ar metodes nextInt palīdzību, jūsu gadījumā tas būs randomNumberGenerator

        //trūkst rezultāta izvade

        int sum = numberOne + numberTwo + numberThree;

        System.out.println(numberOne);
        System.out.println(numberTwo);
        System.out.println(numberThree);

    }
}
