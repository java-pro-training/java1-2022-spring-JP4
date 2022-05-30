package lv.lu.training.lesson8.polymorph;

public class Employee implements Payable{

    private String salary;

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public double pay() {
        return 0;
    }

    @Override
    public String toString() {
        return "Employee" + pay();

    }
}
