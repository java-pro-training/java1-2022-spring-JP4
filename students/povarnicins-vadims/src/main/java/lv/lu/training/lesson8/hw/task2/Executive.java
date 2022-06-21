package lv.lu.training.lesson8.hw.task2;

public class Executive extends Employee {

    private double salary;
    private double bonus;


    public Executive(String firstName, String lastName, String ssn, double salary) {
        super(firstName, lastName, ssn, salary);
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    @Override
    public double pay() {
        return super.getSalary() + bonus;
    }

    @Override
    public String toString() {
        return "Executive employee:" +
                " Employee" + getFirstName() + getLastName() +
                " SSN " + getSsn() +
                "salary: " + super.getSalary() +
                ", bonus: " + bonus +
                ",";
    }


}
