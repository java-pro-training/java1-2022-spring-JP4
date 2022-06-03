package lv.lu.training.lesson8.HW2;

public class Executive extends Employee {
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
        return getSalary() + bonus;
    }

    @Override
    public String toString() {
        return "Executive: " +
                "firstName= " + getFirstName() +
                ", lastName= " + getLastName() +
                ", SSN= " + getSSN() +
                ", bonus= " + bonus;
    }
}
