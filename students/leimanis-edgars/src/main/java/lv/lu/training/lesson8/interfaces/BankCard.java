package lv.lu.training.lesson8.interfaces;

public interface BankCard {

        void getCash(double amount);

        void changePin(String newPinCode);

        String showBalance();
}
