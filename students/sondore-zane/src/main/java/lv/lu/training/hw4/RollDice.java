package lv.lu.training.hw4;

import java.util.Random;

//LABOT
//TUKŠS FAILS
public class RollDice {
    public static void main(String[] args) {
        Random random = new Random();

        int dice1 = random.nextInt(0, 100);
        int dice2 = random.nextInt(0, 100);

    }

    public int sum(int dice1, int dice2) {
        int result = dice1 + dice2;
        return result;

    }

    public int result;

    public String getResult() {
        return result;
    }

        if(result ==2,3,4,5,6,8,9,10,12);

    {
        System.out.println("Lose");
    }
        else if (result ==7,11);

    {
        System.out.println("Win");
    }
        else

    {
        System.out.println("Play Again");
    }
}
}
