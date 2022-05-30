package lv.lu.training.lesson8.polymorph;

public class HourlyEmployee implements Payable{

    private int hoursWorked;
    private double payRate;

    public HourlyEmployee( double payRate) {
        this.payRate = payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    @Override
    public double pay() {
        return hoursWorked*payRate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee" + pay();

    }
}
