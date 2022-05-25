package lv.lu.training.lesson8.abstractclasses;

public class PlayWithAbstractClasses {

    public static void main(String[] args) {
        Circle circle = new Circle("green", 7);
        Rectangle rectangle = new Rectangle("black", 3, 4);

        System.out.println(circle.getColor());
        System.out.println(rectangle.getColor());



    }
}
