package lv.lu.training.lesson3;

import java.util.Random;
//LABOT
public class RandomNumberAdder {
    public static void main(String[] args) {
        Random randomNumberGenerator = new Random();
        int valueOne = 9; //jāģenerē random cipari no Random objekta ar metodes nextInt palīdzību, jūsu gadījumā tas būs randomNumberGenerator
        int valueTwo = 4; //jāģenerē random cipari no Random objekta ar metodes nextInt palīdzību, jūsu gadījumā tas būs randomNumberGenerator
        int valueThree = 8; //jāģenerē random cipari no Random objekta ar metodes nextInt palīdzību, jūsu gadījumā tas būs randomNumberGenerator

        //trūkst rezultāta izvade

    }

    public static int sumValues(int valueOne, int valueTwo){
        int result = valueOne + valueTwo;
        return result;
    }
}
