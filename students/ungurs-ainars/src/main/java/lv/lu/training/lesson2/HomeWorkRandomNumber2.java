package lv.lu.training.lesson2;

public class HomeWorkRandomNumber2 {
    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        int number = (int)(Math.random()*(max-min+1)+min);
        System.out.println("Random number is "+number);
    }
}
