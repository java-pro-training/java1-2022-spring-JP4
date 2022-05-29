package lv.lu.training.lesson8.abstarctclasses;

public abstract class Shapes {

    private String color;

    public Shapes(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract double calculateArea();
}
