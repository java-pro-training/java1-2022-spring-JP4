package lv.lu.training.homework8.salary;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String SSN, double weeklySalary) {
        super(firstName, lastName, SSN);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double pay() {
        return weeklySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee: " +
                "Employee " + getFirstName() + " " + getLastName() + " " + getSSN() +
                ", weeklySalary: $" + getWeeklySalary();
    }
}
