package lv.lu.training.HW7;

public class ArrayUtils {
    public static int[] reverse(int[] array) {

        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            result[array.length - 1 - i] = array[i];

        }
        return result;
    }
}
