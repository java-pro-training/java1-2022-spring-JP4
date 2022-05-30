package lv.lu.training.lesson8.polymorph;

public class PlayWithPoly {

    public static void main(String[] args) {

        Payable person1 = new Executive(3000d, 1000d);
        Payable person2 = new HourlyEmployee(30d);
        Payable person3 = new SalariedEmployee();


        ((HourlyEmployee) person2).setHoursWorked(160);
        ((SalariedEmployee) person3).setSalary(1400);


        System.out.println(person2.toString());
    }

}
