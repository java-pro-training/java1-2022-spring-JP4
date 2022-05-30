package lv.lu.training.homework5;

public class AccountUser {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("LV84PARX0000004511018",
                "7777", 0.00, 200.00, 0.00);

        System.out.println("Mans konts: " + myAccount);
        myAccount.topUp(300.00, "1234");
        myAccount.topUp(100.00, "7777");
        System.out.println("Pec nepareiza pin: " + myAccount);
        myAccount.withdraw(280.00, "7777");
        System.out.println("Pec 180 naudas iznemsanas: " + myAccount);
        myAccount.topUp(300.00, "7777");
        System.out.println("Pec 300 topup" + myAccount);
        myAccount.withdraw(55.00, "7777");
        System.out.println("Pec 55 naudas iznemsanas: " + myAccount);
        myAccount.withdraw(265.00, "7777");
        System.out.println("Pec visa kreditlimita izlietosanas: " + myAccount);
        myAccount.withdraw(5000, "7777");
        System.out.println("Pec limita parsniegsanas (-5000): " + myAccount);


    }
}
