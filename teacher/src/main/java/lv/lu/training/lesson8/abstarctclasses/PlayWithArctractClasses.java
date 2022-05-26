package lv.lu.training.lesson8.abstarctclasses;

public class PlayWithArctractClasses {

    public static void main(String[] args) {
        Circle circle= new Circle("green", 7);
        Rectagle rectagle = new Rectagle("black", 3, 4);

        System.out.println(circle.getColor());
        System.out.println(rectagle.getColor());

    }
}
