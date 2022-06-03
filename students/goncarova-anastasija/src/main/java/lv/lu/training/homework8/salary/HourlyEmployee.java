package lv.lu.training.homework8.salary;

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

    public void addHoursWorked(int hoursWorked) {
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
        return "HourlyEmployee: " +
                "Employee " + getFirstName() + " " + getLastName() + " " + getSSN() +
                ", rate: $" + payRate +
                ", hours worked: " + hoursWorked;
    }
}
