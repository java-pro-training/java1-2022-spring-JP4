package lv.lu.training.lesson4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PlayWithIfs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ludzu ievadi skaitli...");
        int x = scanner.nextInt();

        if (x > 10) {
            System.out.println("x ir lielaks par 10");
        } else if(x==10){
            System.out.println("x ir vienads ar 10");
        } else {
        System.out.println("x ir mazaks par 10");
    }
        System.out.println("programmas beigas");
        boolean y = x > 10? true : false;
                System.out.println(y);


    }
}
