package lv.lu.training.lesson3;

public class Calculator {
    public static void main(String[] args) {
        int valueOne = 5;
        int valueTwo = 7;
        int valueThree = 3;

        int resultFromFirstMethod = sumValues(valueOne, valueTwo);
        printResult(resultFromFirstMethod);

        int resultFromSecondMethod = substractValues(resultFromFirstMethod, valueThree);
        printResult(resultFromSecondMethod);
    }

    public static int sumValues(int x, int y) {
        int result = x + y;
        return result;
    }

    public static int substractValues(int resultFromFirstMethod, int valueThree) {
        int result = resultFromFirstMethod - valueThree;
        return result;
    }

    public static void printResult(int result) {
        System.out.println(result);
        return;
    }
}
