package lv.lu.training.lesson6;

import java.util.Random;

//LABOT
//rollDice metode izmantota vietām nekorekti
public class RollDice {

    public static void main(String[] args) {
        int sumOfWins = 0;
        int diceNumber = rollDice(); //šeit jūs varat dabūt vērtību no metodes un izmantot tālāk
        while (diceNumber != 12) {
            if ((diceNumber == 7) || (diceNumber == 11)) { //jūs pārsetojat result vērtību katru reizi, kad izsaucat rolldice
                sumOfWins++;
                System.out.println("Congratulations, you are the winner! You have won a total of " + sumOfWins + " times");
                diceNumber = rollDice();
            } else if ((diceNumber == 2) || (diceNumber == 3) || (diceNumber == 6)) {
                System.out.println("Unfortunately, you have lost. You have won a total of " + sumOfWins + " times");
                diceNumber = rollDice();
            } else {
                diceNumber = rollDice();
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
