package lv.lu.training.lesson6;

public class OddNumberLookup {
    public OddNumberLookup(int firstNumber, int secondNumber) {
        int n = secondNumber;
        for (int i = firstNumber; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
