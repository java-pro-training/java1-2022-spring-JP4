package lv.lu.training.lesson8.polymorph;

public class Executive implements Payable{

    private double baseSalary;
    private double bonus;

    public Executive(double baseSalary, double bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double pay() {
        return baseSalary+bonus;
    }


    @Override
    public String toString() {
        return "Executive " + pay();
    }
}
