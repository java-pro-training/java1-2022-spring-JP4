package lv.lu.training.hw6;
//LABOT
//nav pabeigts MD
public class OddNumberLookup {
    public static void main(String[] args) {
        int n = 100;
        System.out.print("Odd numbers from 3 to "+n+" are: ");
        for (int i = 3; i <= 7; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
