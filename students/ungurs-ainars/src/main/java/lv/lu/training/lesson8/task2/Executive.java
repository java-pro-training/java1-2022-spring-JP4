package lv.lu.training.lesson8.task2;

public class Executive extends Employee implements Payable {

    private double bonus;

    private double salaryPlusAward() {
        return getSalary() + bonus;
    }

    public Executive(String firstName, String lastName, String socialSecurityNumber, double salary) {
        super(firstName, lastName, socialSecurityNumber, salary);
    }

    @Override
    public double pay() {
        return salaryPlusAward();
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void awardBonus(int i) {
        setBonus(i);
    }

    @Override
    public String toString() {
        return "executive employee: Employee  " + getSocialSecurityNumber() + " salary plus award: $" + salaryPlusAward();
    }
}
