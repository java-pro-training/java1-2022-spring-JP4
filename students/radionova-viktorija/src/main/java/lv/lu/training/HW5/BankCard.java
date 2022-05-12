package lv.lu.training.HW5;

import java.time.LocalDate;

public class BankCard {
    private String bankName;
    private String origin;
    private String holderName;
    private String number;
    private LocalDate expiryDate;
    private String cvv;
    private double balance;

    public BankCard(String bankName, String origin, String holderName, String number, LocalDate expiryDate, String cvv, double balance) {
        this.bankName = bankName;
        this.origin = origin;
        this.holderName = holderName;
        this.number = number;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.balance = balance;
    }

    public void withdrawal(double value) {
        this.balance -= value;

    }

    public void addFunds(double value) {
        balance += value;
    }

    @Override
    public String toString() {
        return "BankCard{" +
                "bankName='" + bankName + '\'' +
                ", origin='" + origin + '\'' +
                ", holderName='" + holderName + '\'' +
                ", number='" + number + '\'' +
                ", expiryDate=" + expiryDate +
                ", cvv='" + cvv + '\'' +
                ", balance=" + balance +
                '}';
    }
}

