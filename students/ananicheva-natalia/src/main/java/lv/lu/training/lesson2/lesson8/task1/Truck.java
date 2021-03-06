package lv.lu.training.lesson2.lesson8.task1;

public class Truck extends Car{
    private long loadCapacity;

    public Truck(String color, int year, String manufacturer, long loadCapacity) {
        super(color, year, manufacturer);
        this.loadCapacity = loadCapacity;
    }
    @Override
    public String toString() {
        return "Truck{" +
                "color='" + getColor() + '\'' +
                ", year='" + getYear() + '\'' +
                ", manufacturer='" + getManufacturer() + '\'' +
                ", loadCapacity=" + loadCapacity +
                "} ";

    }public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Truck truck = (Truck) that;
        return loadCapacity == truck.loadCapacity
                && getColor().equals(truck.getColor())
                && getYear() == truck.getYear()
                && getManufacturer().equals(truck.getManufacturer());

    }}

