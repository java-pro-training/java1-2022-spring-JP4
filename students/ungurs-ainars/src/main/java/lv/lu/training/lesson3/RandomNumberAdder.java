package lv.lu.training.lesson3;

import java.util.Random;

//LABOT
//kods nedarbojas, aizkomentēju, lai citas klases darbojas
//izlaboju
public class RandomNumberAdder {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();

        int numberOne = randomNumberGenerator.nextInt(100);
        int numberTwo = randomNumberGenerator.nextInt(100);
        int numberThree = randomNumberGenerator.nextInt(100);

        int sum = numberOne + numberTwo + numberThree;

        System.out.println(numberOne);
        System.out.println(numberTwo);
        System.out.println(numberThree);

        System.out.println("Summa ir " + sum);
    }
}
