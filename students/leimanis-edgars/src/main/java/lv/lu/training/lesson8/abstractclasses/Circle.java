package lv.lu.training.lesson8.abstractclasses;

public class Circle extends Shapes {

    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 3.14 * Math.pow(radius,2);
    }
}
