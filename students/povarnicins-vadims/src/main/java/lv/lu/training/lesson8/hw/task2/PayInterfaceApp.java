package lv.lu.training.lesson8.hw.task2;

public class PayInterfaceApp {

    public static void main(String[] args) {

        Payable[] payableObjects = new Payable[5];

        payableObjects[0] = new SalariedEmployee("John ", "Smith ", "111-11-1111 ", 800d);
        payableObjects[1] = new SalariedEmployee("Lisa ", "Barnes ", "888-88-8888 ", 1200d);

        payableObjects[2] = new HourlyEmployee("Barn ", "Nobles ", "273-56-288 ", 15);
        ((HourlyEmployee) payableObjects[2]).setHoursWorked(120);
        payableObjects[3] = new HourlyEmployee("Scott ", "Tiger ", "123-13-789 ", 14);
        ((HourlyEmployee) payableObjects[3]).setHoursWorked(144);

        payableObjects[4] = new Executive("", "", "132-56-654 ", 1400d);
        ((Executive) payableObjects[4]).setBonus(1000d);

        for (Payable currentPayable : payableObjects)
            if (currentPayable != null) {
                System.out.println(" " + currentPayable + " payment due = " + currentPayable.pay());
            }
    }


}
