package lv.lu.training.homework8.part2;

public class SalariedEmployee extends Employee {
    double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String SSN, double salary) {
        super(firstName, lastName, SSN, salary);
    }

    @Override
    public double pay() {
        return this.weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
    @Override
    public String toString() {
        return "salaried employee: " + super.toString();
    }
}
