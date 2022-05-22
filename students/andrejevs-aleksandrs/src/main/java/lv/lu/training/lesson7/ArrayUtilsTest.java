package lv.lu.training.lesson7;

import java.util.Arrays;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int[] result = ArrayUtils.reverse(new int[]{1, 2, 3});
        System.out.println("Testejam klases ArrayUtils metodi 'reverse', darbojas...");
        if (result[0] == 3 && result[1] == 2 && result[2] == 1){
            System.out.println("Pareizi");
        }else{
            System.out.println("Nepareizi");
        }
        System.out.println(Arrays.toString(result));
    }
}
