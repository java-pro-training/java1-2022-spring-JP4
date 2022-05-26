package lv.lu.training.lesson8.inheritance;

public class MountainBike extends Bicycle {

    private int gears;
    private boolean hasHorn;


    public MountainBike(String brand, String color, int gears) {
        super(brand, color);
        this.gears = gears;
    }

    public MountainBike(String brand, String color, boolean hasHorn) {
        super(brand, color);
        this.hasHorn = hasHorn;
    }


    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    @Override
    public String toString() {
        return "MountainBike{" +
                "gears=" + gears +
                ", hasHorn=" + hasHorn +
                '}';
    }
}


