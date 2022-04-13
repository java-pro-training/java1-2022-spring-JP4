package lv.lu.training.lesson3;

public class Calculator {

    public static void main(String[] args) {
        int valueOne = 5;
        int valueTwo = 7;
        int valueThree = 3;

        int resultFromFirstMethod = sumValues(valueOne, valueTwo);
        printResult(resultFromFirstMethod);

        int resultFromSecondMethod = subtractValues(resultFromFirstMethod, valueThree);
        printResult(resultFromSecondMethod);
    }

    public static int sumValues(int x, int y) {
        int result = x + y;
        return result;
    }

    /**
     * šeit ir metodes skaidrojums
     */
    public static int subtractValues(int resultFromFirstMethod, int valueThree) {
        int result = resultFromFirstMethod - valueThree; //te ir starprezultāts...
        return result;  //te ir paskaidrojums mainīgajam
    }

    public static void printResult(int result) {
        System.out.println(result); //TODO man ir jāpabeidz šī rinda
        return;
    }
}
