package lv.lu.training.lesson8.HW2;

public class HourlyEmployee extends Employee {

    private int hoursWorked;
    private double payRate;

    public HourlyEmployee(String firstName, String lastName, String SSN, double payRate) {
        super(firstName, lastName, SSN);
        this.payRate = payRate;
    }


    public int getHoursWorked() {
        return hoursWorked;
    }

    public void addHours(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    @Override
    public double pay() {
        return hoursWorked * payRate;
    }

    @Override
    public String toString() {
        return "Hourly employee: " +
                "firstName= " + getFirstName() +
                ", lastName= " + getLastName() +
                ", SSN= " + getSSN() +
                ", rate= " + getPayRate() +
                ", hours worked= " + getHoursWorked();
    }
}
