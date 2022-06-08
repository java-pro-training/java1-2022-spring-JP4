package lv.lu.training.lesson8.abstractclasses;

public class Rectangle extends Shapes {

    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return height * width;
    }
}
