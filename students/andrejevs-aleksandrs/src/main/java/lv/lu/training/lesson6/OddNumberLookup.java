package lv.lu.training.lesson6;

public class OddNumberLookup {
    public OddNumberLookup(int firstNumber, int secondNumber) {
        int i = firstNumber;
        int n = secondNumber;
        for (i = firstNumber; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
