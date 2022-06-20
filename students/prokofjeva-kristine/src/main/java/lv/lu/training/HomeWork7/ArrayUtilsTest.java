package lv.lu.training.HomeWork7;

import java.util.Arrays;
//IESK
public class ArrayUtilsTest {
    public static void main(String[] args) {

        int[] result = ArrayUtils.reverse(new int[]{1, 2, 3});
        System.out.println("Class method test ArrayUtils 'reverse' works ");

        if (result[0] == 3 && result[1] == 2 && result[2] == 1) {
            System.out.println("True ");

        } else {
            System.out.println("False ");
        }
        System.out.println(Arrays.toString(result));


    }

}

