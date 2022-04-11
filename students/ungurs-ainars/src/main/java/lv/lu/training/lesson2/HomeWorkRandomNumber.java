package lv.lu.training.lesson2;
import java.util.Random;

public class HomeWorkRandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(101);
        System.out.println("Random number is "+number);
    }
}
