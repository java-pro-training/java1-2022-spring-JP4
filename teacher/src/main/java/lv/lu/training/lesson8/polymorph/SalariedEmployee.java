package lv.lu.training.lesson8.polymorph;

public class SalariedEmployee implements Payable {

    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double pay() {
        return salary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee" + pay();
    }
}
