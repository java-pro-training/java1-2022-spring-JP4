package lv.lu.training.HomeWork8.First;

public class Truck extends Car {

    private long loadCapacity;

    public Truck(String color, int year, String manufacturer, long loadCapacity) {
        super(color, year, manufacturer);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "loadCapacity=" + loadCapacity + "color= " + getColor() +
                "year =" + getYear() + "manufacturer= " + getManufacturer() +
                '}';
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        if (!super.equals(that)) return false;

        Truck truck = (Truck) that;

        return loadCapacity == truck.loadCapacity
                && getColor().equals(truck.getColor())
                && getYear() == truck.getYear()
                && getManufacturer().equals(truck.getManufacturer());

    }

}

