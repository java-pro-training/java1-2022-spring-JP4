package lv.lu.training.HomeWork8;

public class HourlyEmployee extends Employee {
    private int hoursWorked;
    private double payRate;

    public HourlyEmployee(String firstName, String lastName, String ssn, double salary) {
        super(firstName, lastName, ssn, salary);
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HourlyEmployee that = (HourlyEmployee) o;

        if (hoursWorked != that.hoursWorked) return false;
        return Double.compare(that.payRate, payRate) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = hoursWorked;
        temp = Double.doubleToLongBits(payRate);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public void addHours(int i) {
    }
}
