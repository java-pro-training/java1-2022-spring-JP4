package lv.lu.training.lesson2.lesson4;

import java.util.Scanner;

public class PlayWithSwitch {
    public static void main(String[] args) {
        final String CASE_ONE= "Case one";
        final String CASE_TWO= "Case two";
        final String CASE_THREE= "Case three";

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter case");
        String variable=scanner.nextLine();
        switch (variable){
            case CASE_ONE:
                System.out.println(" This is first case!");
                break;
            case CASE_TWO:
                System.out.println(" This is second case!");
                break;
            case CASE_THREE:
                System.out.println(" This is third case!");
            default:
                System.out.println("DOH!");

        }
    }
}
