package lv.lu.training.lessson6;

public class PlayWithBreak {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
    }
}
