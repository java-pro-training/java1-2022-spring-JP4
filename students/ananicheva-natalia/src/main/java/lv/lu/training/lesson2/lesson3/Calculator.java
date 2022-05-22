package lv.lu.training.lesson2.lesson3;

public class Calculator {
    public static void main(String[] args) {
        int valueOne = 5;
        int valueTwo = 7;
        int valueThree = 3;
        int resultFromFirstMethod = sumValues(valueOne, valueTwo);
//        resultFromMethod = result;
        printResult(resultFromFirstMethod);

        int resultFromSecondMethod = subtrackValues(resultFromFirstMethod, valueThree);
        printResult(resultFromSecondMethod);
    }
    public static int sumValues(int valueOne, int valueTwo){
        int result = valueOne + valueTwo;
        return result;

    }
    public static int subtrackValues(int resultFromFirstMethod, int valueThree){
        int result = resultFromFirstMethod - valueThree;
        return result;
    }
    public static void printResult(int result){
        System.out.println(result);
        return;
    }
}
