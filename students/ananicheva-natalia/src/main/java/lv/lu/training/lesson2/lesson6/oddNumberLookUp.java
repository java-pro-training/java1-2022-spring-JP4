package lv.lu.training.lesson2.lesson6;


import java.util.Scanner;

public class oddNumberLookUp {
    public static void main(String[] args) {
        Scanner enterY = new Scanner(System.in);
        System.out.println("y=");
        int y = enterY.nextInt();
        Scanner enterX = new Scanner(System.in);
        System.out.println("x=");
        for (int x = enterX.nextInt(); x <= y; x++) {
            if (x % 2 > 0)
                System.out.println(x);
        }

    }
}







