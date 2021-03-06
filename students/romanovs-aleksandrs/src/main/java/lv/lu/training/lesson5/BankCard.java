package lv.lu.training.lesson5;

import java.time.LocalDate;
//IESK
public class BankCard {
    private String bankName;
    private String origin;
    private String holderName;
    private String number;
    private LocalDate expiryDate;
    private String ccv;
    private double balance;

    public BankCard(String bankName, String origin, String holderName, String number, LocalDate expiryDate, String ccv, double balance) {
        this.bankName = bankName;
        this.origin = origin;
        this.holderName = holderName;
        this.number = number;
        this.expiryDate = expiryDate;
        this.ccv = ccv;
        this.balance = balance;
    }

    public void withdraw(double value) {
        this.balance -= value;

    }

    @Override
    public String toString() {
        return "BankCard{" +
                "bankName='" + bankName + '\'' +
                ", origin='" + origin + '\'' +
                ", holderName='" + holderName + '\'' +
                ", number='" + number + '\'' +
                ", expiryDate=" + expiryDate +
                ", ccv='" + ccv + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void addFunds(double value) {
        this.balance += value;


    }
}
