package lv.lu.training.lesson8.HW2;

abstract public class Employee implements Payable {
    private String firstName;
    private String lastName;
    private String SSN;
    private double salary;

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

    public Employee(String firstName, String lastName, String SSN, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
        this.salary = salary;
    }

    public Employee(String firstName, String lastName, String SSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", SSN='" + getSSN() + '\'' +
                '}';
    }
}
