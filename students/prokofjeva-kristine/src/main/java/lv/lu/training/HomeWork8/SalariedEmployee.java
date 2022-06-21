package lv.lu.training.HomeWork8;


public class SalariedEmployee extends Employee {

    public SalariedEmployee(String firstName, String lastName, String ssn, double salary) {
        super(firstName, lastName, ssn, salary);
    }

    private double weekleySalary;


    public double getWeekleySalary() {
        return weekleySalary;
    }

    public void setWeekleySalary(double weekleySalary) {
        this.weekleySalary = weekleySalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SalariedEmployee that = (SalariedEmployee) o;

        return Double.compare(that.weekleySalary, weekleySalary) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(weekleySalary);
        return (int) (temp ^ (temp >>> 32));
    }
}
