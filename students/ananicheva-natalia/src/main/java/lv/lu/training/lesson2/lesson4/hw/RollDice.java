package lv.lu.training.lesson2.lesson4.hw;

import java.util.Random;
//IESK
public class RollDice {
        public static void main(String[] args) {
            Random random = new Random();
            int dice1 = random.nextInt((6) + 1);
            int dice2 = random.nextInt((6) + 1);
            int result = dice1 + dice2;
            System.out.println(result);
            if (result == 7) { //šeit varēja izmantot OR nosacījumu un likt klāt 11 pārbaudi
                System.out.println("you win");

            } else if (result==11){
                System.out.println("you win");
            }else {
                System.out.println("you lost");
            }
        }

    }
