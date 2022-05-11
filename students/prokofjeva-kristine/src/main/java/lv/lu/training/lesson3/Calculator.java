package lv.lu.training.lesson3;

public class Calculator {

    public static void main(String[] args) {
        int valueOne = 5;
        int valueTwo = 7;
        int valueThree = 3;

        int resultFromFirstMethod = sumValue(valueOne, valueTwo);
        printResult(resultFromFirstMethod);

        int resultFromSecondMethod = subtractValues(resultFromFirstMethod, valueThree);
        printResult(resultFromSecondMethod);

    }

    public static int sumValue(int valueOne, int valueTwo) {
        int result = valueOne + valueTwo;
        return result;

    }

    public static int subtractValues(int resultFromFirstMethod, int valueThree) {
        int result = resultFromFirstMethod - valueThree;
        return result;
    }

    public static void printResult(int result) {
        System.out.println(result);
        return;
    }
}
