package lv.lu.training.homework8;

public class Bus extends Car implements Passenger{

    private final int passengerSeatCount;

    public Bus(String color, int year, String manufacturer, int passengerSeatCount) {
        super(color, year, manufacturer);
        this.passengerSeatCount = passengerSeatCount;
    }

    @Override
    public int passengerSeatCount() {
        return this.passengerSeatCount;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "passengerSeatCount=" + passengerSeatCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Bus bus = (Bus) o;

        return passengerSeatCount == bus.passengerSeatCount;
    }

}
