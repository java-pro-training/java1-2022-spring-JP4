package lv.lu.training.lesson3;

import java.util.Random;

public class randomNumberGenerator {
    public static void main(String[] args) {
        Random rand = new Random();

//        Izvelesimies ciparus lidz 1000, lai butu vieglak parbaudit rezultatu
        int nxt1 = rand.nextInt (1000);
        int nxt2 = rand.nextInt (1000);
        int nxt3 = rand.nextInt(1000);

        System.out.println("Random number No1 is: " + nxt1);
        System.out.println("Random number No2 is: " + nxt2);
        System.out.println("Random number No3 is: " + nxt3);
        System.out.println("Sum of random numbers is: " + (nxt1 + nxt2 + nxt3));
    }
}
