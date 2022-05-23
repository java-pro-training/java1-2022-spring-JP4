package lv.lu.training.lesson2.lesson4;

public class QuickMathTest {
    public void test1() {
        QuickMath victim = new QuickMath();
        int a = 6;
        int b = 5;
        int expectedResult = 5;
        int actualResult = victim.max(a, b);
        check(actualResult, expectedResult, "testone");

    }

    public void check(int actualResult, int expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println(" Expected " + expectedResult + " but was " + actualResult);
        }
    }

    public void test2(){
        QuickMath victim = new QuickMath();
        int a = 4;
        String expecteResult= "even";
        String actualResult= victim.testNumber(a);
        chek2 (actualResult, expecteResult, "test2");
    }

    public void chek2 (String actualResult, String expectedResult, String testName) {
        if (actualResult.equals(expectedResult)){
            System.out.println(testName + " has passed");

        }else{
            System.out.println(testName + "has failed!");
            System.out.println("Expected" + expectedResult + " but was" + actualResult);
        }
    }

}
