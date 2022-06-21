package lv.lu.training.homework8.part2;

public class Executive extends Employee{
    double bonus;

    public Executive(String firstName, String lastName, String SSN, double salary) {
        super(firstName, lastName, SSN, salary);
    }

    public void awardBonus(double bonus){
        this.bonus = bonus;
    }

    @Override
    public double pay() {
        double result = super.pay() + bonus;
        bonus = 0;
        return result;

    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "executive employee: "+ super.toString();
    }
}
