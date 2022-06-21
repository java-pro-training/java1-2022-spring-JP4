package lv.lu.training.lesson8.HW2;
//IESK
public class PayInterfaceApp {
    public static void main(String[] args) {
        Payable[] payableObjects = new Payable[5];
        payableObjects[0] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00d);
        payableObjects[1] = new SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00d);
        payableObjects[2] = new HourlyEmployee("Barn", "Nobles", "273-56-288", 15.0d);
        ((HourlyEmployee) payableObjects[2]).addHours(120);
        payableObjects[3] = new HourlyEmployee("Scott", "Tiger", "123-13-789", 14.0d);
        ((HourlyEmployee) payableObjects[3]).addHours(144);
        payableObjects[4] = new Executive("Michael", "Borques", "132-56-654", 1400d);
        ((Executive) payableObjects[4]).awardBonus(1000);
        for (Payable currentPayable : payableObjects) {
            if (currentPayable != null) {
                System.out.println("" + currentPayable + " payment due= " + currentPayable.pay());
            }
        }

    }


}
