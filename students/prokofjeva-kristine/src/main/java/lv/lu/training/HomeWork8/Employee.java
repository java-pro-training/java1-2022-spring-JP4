package lv.lu.training.HomeWork8;

public class Employee implements Payable {

    private final String firstName;
    private final String lastName;
    private final int ssn;
    private final double salary;

    public Employee(String salary, String firstName, String lastName, double ssn) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = (int) ssn;
        this.salary = Double.parseDouble(salary);

    }

    public double getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSsn() {
        return ssn;
    }

    @Override
    public double pay() {
        return 0;
    }
}
