package lv.lu.training.homework8.part2;

public class HourlyEmployee extends Employee {
    int hoursWorked;
    double payRate;

    public HourlyEmployee(String firstName, String lastName, String SSN, double salary) {
        super(firstName, lastName, SSN, salary);
    }

    @Override
    public double pay() {

        double result = this.hoursWorked * this.payRate;
        this.hoursWorked = 0;
        return result;
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

    public void addHours(int addHours) {
        this.hoursWorked += addHours;
    }
    @Override
    public String toString() {
        return "hourly employee: " + super.toString();
    }
}
