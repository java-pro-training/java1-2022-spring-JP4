package lv.lu.training.HomeWork8;

public class Truck extends Car {

    private long loadCapacity;

    public Truck(String color, int year, String manufacturer, long loadCapacity) {
        super(color, year, manufacturer);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "loadCapacity=" + loadCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Truck truck = (Truck) o;

        return loadCapacity == truck.loadCapacity;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (int) (loadCapacity ^ (loadCapacity >>> 32));
        return result;
    }
}
