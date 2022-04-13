package lv.lu.training.lesson2.Hwork;

public class Perimeter {
    public static void main(String[] args) {

        int side1 = 10;
        int side2 = 15;
        int side3 = 20;
        int side4 = 25;
        int result = side1;
        result = result + side2;
        result += side3;
        result += side4;

        System.out.println("perimeter: "+result);
    }
}
