package lv.lu.training.lesson2.lesson6;

import java.util.Random;
//LABOT
//result netiek izmainīts ciklā, rodas mūžīgais cikls
public class RollDice {
    public static void main(String[] args) {
        Random random = new Random();
        int dice1 = random.nextInt((6) + 1);
        int dice2 = random.nextInt((6) + 1);
        int result = dice1 + dice2;
        System.out.println(result);
        int sumOfWins=0;
        int sumOfLost=0;
        while (result!=12){ //mūžīgais cikls, vajag piešķirt cikla ķermenī vēlreiz vērtības, ja gadījumā nebija 12 jau sākumā.
            if(result==7|| result==11){
                sumOfWins++;
                System.out.println("You win game "+sumOfWins+" times");
            }if(result==2||result==3||result==6) {
                sumOfLost++;
                System.out.println("You lost game "+sumOfLost+" times");
            }

        }
    }
}
