package lv.lu.training.lesson4;

public class QuickMathTest {
    public void test1() {
        QuickMath victim = new QuickMath();
        int a = 3;
        int b = 5;
        int expectedResult = 5;
        int actualResult = victim.max(a, b);
        check(actualResult, expectedResult, "TestOne");
    }

    public void check(int actualResult, int expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected " + expectedResult + " but was " + actualResult);
        }
    }

    public void test2() {
        QuickMath victim = new QuickMath();
        int a = 4;
        String expectedResult = "even";
        String actualResult = victim.testNumber(a);
        check2(actualResult, expectedResult, "TestTwo");

    }

    public void check2(String actualResult, String expectedResult, String testName) {
        if (actualResult.equals(expectedResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected " + expectedResult + " but was " + actualResult);
        }
    }
}

