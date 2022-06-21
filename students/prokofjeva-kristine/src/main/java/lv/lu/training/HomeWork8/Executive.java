package lv.lu.training.HomeWork8;

public class Executive extends Employee {

    public Executive(String firstName, String lastName, String ssn, double salary) {
        super(firstName, lastName, ssn, salary);
    }

    private double bonus;
    private double awardBonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getAwardBonus() {
        return awardBonus;
    }

    public void setAwardBonus(double awardBonus) {
        this.awardBonus = awardBonus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Executive executive = (Executive) o;

        if (Double.compare(executive.bonus, bonus) != 0) return false;
        return Double.compare(executive.awardBonus, awardBonus) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(bonus);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(awardBonus);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public void awardBonus(int i) {
    }
}
