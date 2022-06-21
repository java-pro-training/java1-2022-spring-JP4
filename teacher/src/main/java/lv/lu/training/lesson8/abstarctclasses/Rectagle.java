package lv.lu.training.lesson8.abstarctclasses;

public class Rectagle extends Shapes {

    private int width;
    private int height;

    public Rectagle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return height * width;
    }
}
