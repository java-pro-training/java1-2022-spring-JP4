package lv.lu.training.HomeWork6;

public class OddNumberLookUp {
    public OddNumberLookUp(int firstNumber, int secondNumber) {
        int n = secondNumber;
        for (int i = firstNumber; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
