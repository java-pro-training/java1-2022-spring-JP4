package lv.lu.training.HomeWork6;

import java.util.Random;
//LABOT
//jūs izmantojat rollDice vairākas reizes, bet būtu jaizmanto, tikai lai ielikt vērtību result daļā un tad cikla beigās, lai ieliktu pa jaunas vērtību
public class TwoDice {

    public static void main(String[] args) {
        int sumOfWins = 0;
        rolldice();

        while (rolldice() != 12) {

            if ((rolldice() == 7) || (rolldice() == 11)) {
            }
            sumOfWins++;
            System.out.println("You win! Your total " + sumOfWins + " times");
            rolldice();
        }
        if ((rolldice() == 2) || (rolldice() == 3) || (rolldice() == 6)) {

            System.out.println("You lose! Your total " + sumOfWins + " times");
            rolldice();
        } else {
            rolldice();

        }

    }

    private static int rolldice() {
        Random random = new Random();
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;
        int result = dice1 + dice2;
        return result;
    }


}
