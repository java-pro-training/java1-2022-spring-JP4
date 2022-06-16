package lv.lu.training.HW6;

import java.util.Random;
//LABOT
//jūs izmantojat rollDice vairākas reizes, bet būtu jaizmanto, tikai lai ielikt vērtību result daļā un tad cikla beigās, lai ieliktu pa jaunas vērtību
public class RollDice {
    public static void main(String[] args) {

    int sumOfWins = 0;
    rollDice();
    while (rollDice() != 12) {
        if ((rollDice() == 7) || (rollDice() == 11)) {
            sumOfWins++;
            System.out.println("You win: " + sumOfWins );
            rollDice();
        } else if ((rollDice() == 2) || (rollDice() == 3) || (rollDice() == 6)) {
            System.out.println("You loose: " + sumOfWins );
            rollDice();
        } else {
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

