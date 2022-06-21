package lv.lu.training.HMW6;

import java.util.Random;
//LABOT
public class RollDice2 {



    public static void main(String[] args) {
        rollDice();
        int result = rollDice();
        int sumOfWin = 0;
        while (rollDice() != 12) ; {  //cikls apstāja pie semikola, kā arī jūs neizmantojat result vērtību un vēlāk arī neuzliekat jaunu result, ja gadījumā jums nav 12
            if (result == 7 || result == 11) { //jums nav iel
                sumOfWin++;
                System.out.println("Result: " + result + "! Winner! You won: " + sumOfWin);
                rollDice();
            } else if (result == 2 || result == 3 || result == 6) {
                System.out.println("Result: " + result +  "! Looser! You won: " + sumOfWin);
                rollDice();
            } else {
                System.out.println("Result: " + result +  " ! Roll one more time! You won: " + sumOfWin);
                rollDice();
            }
        }
    }
    public static int rollDice() {
        Random random = new Random();

        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;
        int result = dice1 + dice2;
        return result;
    }

}