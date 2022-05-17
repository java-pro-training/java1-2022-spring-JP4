package lv.lu.training.lesson6;

public class PlayWithFor {

    public static void main(String[] args) {
        simpleFor();
        otherForCycleExample();
        anotherForExample();
    }

    private static void simpleFor() {
        for (int i = 10; i > 4; i--) {
            System.out.println("This is cycle number" + i);
        }
    }

    private static void otherForCycleExample() {

        int sum = 0;

        for (int n = 50; n > 1; n--) {
            if (n % 2 == 0) {
                sum += n;
            }
    }
        System.out.println("Final result + sum");
}
    private static void anotherForExample() {
        for (String x = ""; x.length() <= 5; x = x + "*") {
            System.out.println(x);
        }
    }
}