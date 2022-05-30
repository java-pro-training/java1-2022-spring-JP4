package lv.lu.training.lesson8.interfaces;

public class AmericanBlueCard implements BankCard{
    @Override
    public void getCash(double amount) {
        System.out.println("Get money from AmericanBlueCard");
    }

    @Override
    public void changePin(String newPinCode) {
        System.out.println("Change pin for AmericanBlueCard");
    }

    @Override
    public double showBalance() {
        return 0;
    }
}
