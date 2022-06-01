package lv.lu.training.HomeWork8;

public class Buss extends Car implements Passenger {
    private final int passengerSeatCount;


    public Buss(String color, int year, String manufacturer, int passengerSeatCount) {
        super(color, year, manufacturer);
        this.passengerSeatCount = passengerSeatCount;

    }


    @Override
    public int passengerSeatCount() {
        return 0;
    }

    @Override
    public String toString() {
        return "Buss{" +
                "passengerSeatCount=" + passengerSeatCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Buss buss = (Buss) o;

        return passengerSeatCount == buss.passengerSeatCount;
    }

    @Override
    public int hashCode() {
        return passengerSeatCount;
    }
}
