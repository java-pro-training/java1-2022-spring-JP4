package lv.lu.training.lesson6;

public class OddNumberLookup {
    public static boolean isOdd(int number) {
        return number % 2 == 1;
    }

    public static void printOddWithin(int from, int till) {
        for (int i = from; i <= till; i++)
            if (isOdd(i)) {
                System.out.println(i);
            }
    }

}
