package lv.lu.training.lesson8.hw.task2;

public class SalariedEmployee extends Employee {

    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String ssn, double salary) {
        super(firstName, lastName, ssn, salary);
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double pay() {
        return super.getSalary();
    }

    @Override
    public String toString() {
        return "SalariedEmployee:" +
                " Employee " + getFirstName() + getLastName() +
                "SSN " + getSsn() +
                "weekly salary: " + super.getSalary() +
                ",";
    }
}
