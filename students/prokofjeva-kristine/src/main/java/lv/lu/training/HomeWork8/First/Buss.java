package lv.lu.training.HomeWork8.First;

public class Buss extends Car  {
    private final int passengerSeatCount;


    public Buss(String color, int year, String manufacturer, int passengerSeatCount) {
        super(color, year, manufacturer);
        this.passengerSeatCount = passengerSeatCount;


    }


    @Override
    public String toString() {

        return "Buss{" +
                 "color= " + getColor()+
                "year= " + getYear() + "manufacturer= " + getManufacturer()+"passengerSeatCount=" + passengerSeatCount+
                '}';
    }


    @Override
    public boolean equals(Object that) {
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        if (!super.equals(that)) return false;

        Buss buss = (Buss) that;

        return passengerSeatCount == buss.passengerSeatCount
                && getColor().equals(buss.getColor())
                && getYear()== buss.getYear()
                && getManufacturer().equals(buss.getManufacturer());
    }

    }


