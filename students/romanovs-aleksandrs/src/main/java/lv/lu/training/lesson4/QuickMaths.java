package lv.lu.training.lesson4;

public class QuickMaths {
    public int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public String testNumber(int testValue) {
        if (testValue % 2 == 0) {
            return "even";

        } else {
            return "odd";
        }
    }
}

