package lv.lu.training.lesson7.HW7;

public class ArraysUtilsTest {
    public static void main(String[] args) {
        int[] result = ArrayUtils.reverse(new int[]{1,2,3});
        System.out.println("Testing the 'reverse' method of the class ArrayUtils, it works..");
        if (result[0] == 3 && result[1] == 2 && result[2] == 1){
            System.out.println("TRUE!");
        } else {
            System.out.println("FALSE!");
        }
    }
}
