package lv.lu.training.lesson8.hw.task2;

public abstract class Employee implements Payable {

    private String firstName;
    private String lastName;
    private String ssn;
    private double salary;

    public Employee(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }

    public Employee(String firstName, String lastName, String ssn, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ssn='" + ssn + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public double pay() {
        return 0;
    }
}
