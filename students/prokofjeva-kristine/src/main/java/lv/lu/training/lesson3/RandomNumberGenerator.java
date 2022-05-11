package lv.lu.training.lesson3;

import java.util.Random;

//IZLABOTS
//LABOT
//kods nedarbojas
public class RandomNumberGenerator {
    public static void main(String[] args) {

        Random randomNumberGenerator = new Random();

        int FirstRandomNumber = randomNumberGenerator.nextInt();
        int SecondRandomNumber = randomNumberGenerator.nextInt();
        int ThirdRandomNumber = randomNumberGenerator.nextInt();
        int result = FirstRandomNumber + SecondRandomNumber + ThirdRandomNumber;

        System.out.println("First random number - " + FirstRandomNumber);
        System.out.println("Second random number - " + SecondRandomNumber);
        System.out.println("Third random number - " + ThirdRandomNumber);
        System.out.println("Result - " + result);


    }
}
