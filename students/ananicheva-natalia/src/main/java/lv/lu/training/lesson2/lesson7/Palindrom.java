package lv.lu.training.lesson2.lesson7;
import java.util.Scanner;
//LABOT
// uzdevuma apraksts savādāks.
public class Palindrom {

        public static void main(String[] args){
            System.out.println("enter word: ");
            Scanner scn=new Scanner(System.in);
            String s=scn.nextLine().toLowerCase();
            if(s.length()==5){ //šis nosacījums pārbaudīts tikai vārdus ar 5 simboliem
                if(s.charAt(0)==s.charAt(4)&s.charAt(1)==s.charAt(3)){
                    System.out.println("this word is palindrom");
                }
                else System.out.println("this word is not a palindrom");
            }


        }
    }

