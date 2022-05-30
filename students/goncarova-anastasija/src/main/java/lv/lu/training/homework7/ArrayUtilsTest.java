package lv.lu.training.homework7;

import java.util.Arrays;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int [] result = ArrayUtils.reverse (new int[]{1,2,3});
        System.out.println("Testējam klases ArrayUtils mētodi 'reverse', darbojas .. ");
        if (result[0] == 3 && result[1] == 2 && result[2] == 1 ){
            System.out.println("PAREIZI!");
        } else{
            System.out.println("NEPAREIZI!");
        }
        System.out.println(Arrays.toString(result));
    }
}
