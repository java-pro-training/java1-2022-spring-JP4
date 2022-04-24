package lv.lu.training.lesson3.hw3;

import java.util.Random;
//IESK
public class RandomNumberAdder {
    public static void main(String[] args) {

        Random randomNumberGenerator = new Random();
        int randomNumber1 = randomNumberGenerator.nextInt(10);
        int randomNumber2 = randomNumberGenerator.nextInt(10);
        int randomNumber3 = randomNumberGenerator.nextInt(10);

        int valueOne = randomNumber1; // šī rindiņa neko nedara, varēja atstāt 9,10,11 rindiņas, kā mainīgo vērtību definēšanu
        int valueTwo = randomNumber2; // šī rindiņa neko nedara, varēja atstāt 9,10,11 rindiņas, kā mainīgo vērtību definēšanu
        int valueThree = randomNumber3; // šī rindiņa neko nedara, varēja atstāt 9,10,11 rindiņas, kā mainīgo vērtību definēšanu

        System.out.println("Random Nr1: " + valueOne);
        System.out.println("Random Nr2: " + valueTwo);
        System.out.println("Random Nr3: " + valueThree);

        int resultFromFirstMethod = sumValues(valueOne, valueTwo);
        printResult(resultFromFirstMethod);

        int resultFromSecondMethod = subtractValues(resultFromFirstMethod, randomNumber3);
        printResult(resultFromSecondMethod);

    }

    public static int sumValues(int valueOne, int valueTwo) {  //nav labā prakse lietot static metodēm, labāk vērsties pie metodes caur objektu, ko mācīsies vēlāk
        return valueOne + valueTwo;

    }

    public static int subtractValues(int resultFromFirstMethod, int valueThree) { // ar ko atšķiras ši metode no sumValues metodes? lieks kods. nav labā prakse lietot static metodēm
        return resultFromFirstMethod + valueThree;

    }

    public static void printResult(int result) {  //nav labā prakse lietot static metodēm, labāk vērsties pie metodes caur objektu, ko mācīsies vēlāk

        System.out.println(result);
    }


}
