package lv.lu.training.lesson7;

public class PlayWithStatic {

    public static String myName = "Edgars";

    public static int counter = 0;

    public static final String MY_SURNAME = "Leimanis";

    public PlayWithStatic(){
        counter++;


    }

    public static void main(String[] args) {
//        System.out.println(PlayWithStatic.myName);

        PlayWithStatic obj1 = new PlayWithStatic();
        obj1.myName="Andris";
        PlayWithStatic obj2 = new PlayWithStatic();
        System.out.println(obj2.myName);
        System.out.println(PlayWithStatic.counter);
    }
}
