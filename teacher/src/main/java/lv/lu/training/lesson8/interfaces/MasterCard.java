package lv.lu.training.lesson8.interfaces;

public class MasterCard implements BankCard {

    private double balance;

    public MasterCard(double balance) {
        this.balance = balance;
    }

    @Override
    public void getCash(double amount) {
        System.out.println("Get money from MasterCard");
    }

    @Override
    public void changePin(String newPinCode) {
        System.out.println("Change pin for MasterCard");
    }

    @Override
    public double showBalance() {
        return balance;
    }
}
