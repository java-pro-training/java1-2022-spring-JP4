package lv.lu.training.homework8.salary;

public class Executive extends Employee{
    private double bonus = 0;

    public Executive(String firstName, String lastName, String SSN, double salary) {
        super(firstName, lastName, SSN, salary);
    }

    public double getBonus() {
        return bonus;
    }

    public void awardBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double pay() {
        return getSalary() + getBonus();
    }

    @Override
    public String toString() {
        return "Executive: " +
                "Employee  " + getFirstName() + " " + getLastName() + " " + getSSN() +
                ", salary plus award: $" + getBonus();
    }
}
