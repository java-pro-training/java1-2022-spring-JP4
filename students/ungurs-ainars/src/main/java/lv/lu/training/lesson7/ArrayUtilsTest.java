package lv.lu.training.lesson7;
//IESK
public class ArrayUtilsTest {
    public static void main(String[] args) {
        int[] result = ArrayUtils.reverse(new int[]{1, 2, 3});

        System.out.print("Testejam klases ArrayUtils metodi 'reverse', darbojas ..");
        if (result[0] == 3 && result[1] == 2 && result[2] == 1) {
            System.out.println("PAREIZI");
        } else {
            System.out.println("NEPAREIZI");
        }
    }
}
