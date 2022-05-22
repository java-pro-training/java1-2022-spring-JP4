package lv.lu.training.lesson2.lesson4;

import java.util.Scanner;

public class PlayWithIfs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ludzu ievadi skaitli...");
        int x= scanner.nextInt();
         if (x>10){
             System.out.println("x ir lielaks par 10");
    }else if (x==10){
            System.out.println("x ir vienads ar 10");
         } else {System.out.println("x ir mazaks par 10");
    }
        System.out.println("programmas beigas");
         boolean y=x>10?true:false;
        System.out.println(y);
        System.out.println("///////////////////////////////");

        int z=10;
        int c = 5;
        if ((z==10)&&(c>10)){
            System.out.println("This is true!");
        }else {
            System.out.println("This is false!");
        }
        System.out.println("////////////////////////////////");

        int a=10;
        if (a!=10){
            System.out.println("not equals");
        }else {
            System.out.println("is equals");
        }

}
}
