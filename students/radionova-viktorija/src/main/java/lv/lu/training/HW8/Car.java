package lv.lu.training.HW8;


import java.util.Objects;

public class Car {
    private final String color;
    private final int year;
    private final String manufacturer;

    public Car(String color, int year, String manufacturer) {
        this.color = color;
        this.year = year;
        this.manufacturer = manufacturer;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", year=" + year +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Car car = (Car) that;
        return Objects.equals(color, car.color) &&
                Objects.equals(year, car.year) &&
                Objects.equals(manufacturer, car.manufacturer);
    }
}
