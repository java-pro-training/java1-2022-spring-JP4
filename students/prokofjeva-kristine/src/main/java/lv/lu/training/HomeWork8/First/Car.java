package lv.lu.training.HomeWork8.First;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (year != car.year) return false;
        if (!color.equals(car.color)) return false;
        return manufacturer.equals(car.manufacturer);
    }

    @Override
    public int hashCode() {
        int result = color.hashCode();
        result = 31 * result + year;
        result = 31 * result + manufacturer.hashCode();
        return result;
    }
}
