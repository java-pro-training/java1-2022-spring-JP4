package lv.lu.training.lesson8.hw.task2;

public class HourlyEmployee extends Employee {

    private int hoursWorked;
    private double payRate;


    public HourlyEmployee(String firstName, String lastName, String ssn, double payRate) {
        super(firstName, lastName, ssn);
        this.payRate = payRate;
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
    public double pay() {
        return hoursWorked * payRate;
    }

    @Override
    public String toString() {
        return "Hourly Employee:" +
                " Employee " + getFirstName() +
                getLastName() +
                "SSN " + getSsn() +
                "hours worked: " + hoursWorked +
                ", rate: " + payRate +
                ",";
    }

}
