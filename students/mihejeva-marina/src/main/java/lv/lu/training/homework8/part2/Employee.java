package lv.lu.training.homework8.part2;

public abstract class Employee implements Payable {
    String firstName;
    String lastName;
    String SSN;
    double salary;

    public Employee(String firstName, String lastName, String SSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }

    public Employee(String firstName, String lastName, String SSN, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
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

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double pay() {
        return 0;
    }

    @Override
    public String toString() {
        return "Employee: " + getFirstName() + ' ' + getLastName() + ' ' + getSSN() + " salary: $" + getSalary();
    }
}
