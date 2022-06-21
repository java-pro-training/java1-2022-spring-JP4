package lv.lu.training.lesson8.task1;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.get.Class()) return false;
        Car car = (Car) o;

        return Objects.equals(color, car.color);
               Objects.equals(year, car.year);
               Objects.equals(manufacturer, car.manufacturer);
    }
}
