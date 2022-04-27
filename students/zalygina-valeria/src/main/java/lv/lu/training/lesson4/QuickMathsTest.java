package lv.lu.training.lesson4;

public class QuickMathsTest {
    public void test1() {
        QuickMaths victim = new QuickMaths();
        int a = 6;
        int b = 5;
        int expectedResult = 5;
        int actualResult = victim.max(a, b);

        check(actualResult, expectedResult, "Test one");
    }
    public void check(int actualResult, int expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " has passed!");

        } else {
            System.out.println(testName + "has failed!");
            System.out.println("Expected " + expectedResult + " , but was " + actualResult);
        }
    }


    public void test2() {
        QuickMaths victim = new QuickMaths();
        int a = 5;
        String expectedResult = "even";
        String actualResult = victim.testNumber(a);

        check2(actualResult, expectedResult, "Test two");

    }

    public void check2(String actualResult, String expectedResult, String testName) {
        if (actualResult.equals(expectedResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected " + expectedResult + " , but was " + actualResult);
        }
    }
}
