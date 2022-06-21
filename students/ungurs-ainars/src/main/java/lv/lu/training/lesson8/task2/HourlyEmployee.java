package lv.lu.training.lesson8.task2;

public class HourlyEmployee extends Employee implements Payable {

    private int hoursWorked;
    private double payRate;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double payRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.payRate = payRate;
    }

    @Override
    public double pay() {
        return hoursWorked * payRate;
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

    public void addHours(int i) {
        setHoursWorked(i);
    }

    @Override
    public String toString() {
        return "hourly employee: " + getFirstName() + ' ' + getLastName() + ' ' + getSocialSecurityNumber() + " rate: $" + getPayRate() + " hours worked: " + getHoursWorked();
    }
}
