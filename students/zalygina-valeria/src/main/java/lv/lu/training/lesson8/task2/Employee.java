package lv.lu.training.lesson8.task2;
//LABOT
//Kods nedarbojas
public abstract class Employee implements Payable {

    private String firstName;
    private String lastName;
    private String SSN;
    private double salary;

    public Employee(String firstName, String lastName, String SSN) {
        super();
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return SSN;
    }

    public void setSsn(String Ssn) {
        this.SSN = Ssn;
    }

    public double getSalary() {
        return salary;
    }

    public voit setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String firstName, String lastName, String Ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", Ssn='" + getSsn() + '\'' +
                '}';
    }
}
