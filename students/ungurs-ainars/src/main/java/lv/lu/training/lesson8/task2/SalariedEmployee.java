package lv.lu.training.lesson8.task2;

public class SalariedEmployee extends Employee implements Payable {

    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double pay() {
        return weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString() {
        return "salaried employee: " + getFirstName() + ' ' + getLastName() + ' ' + getSocialSecurityNumber() + " weekly salary: $" + getWeeklySalary();
    }
}
