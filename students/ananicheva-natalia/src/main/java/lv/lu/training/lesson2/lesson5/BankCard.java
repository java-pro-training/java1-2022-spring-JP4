package lv.lu.training.lesson2.lesson5;

import java.time.LocalDate;

public class BankCard {
    private String bankName;
    private String origin;
    private String holderName;
    private String number;
    private LocalDate expariteDate;
    private String cvv;
    private double balance;

    public BankCard(String bankName, String origin, String holderName, String number, LocalDate expariteDate, String cvv, double balance) {
        this.bankName = bankName;
        this.origin = origin;
        this.holderName = holderName;
        this.number = number;
        this.expariteDate = expariteDate;
        this.cvv = cvv;
        this.balance = 0;
    }

    public void withdraw(double value) {
        this.balance -= value;

    }

    public void addFonds(double value) {
        this.balance += value;

    }

    @Override
    public String toString() {
        return "BankCard{" +
                "bankName='" + bankName + "' " +
                ", origin='" + origin + "' " +
                ", holderName='" + holderName + "' " +
                ", number='" + number + "' " +
                ", expiryDate=" + expariteDate +
                ", cvv='" + cvv + "' " +
                ", balance=" + balance +
                '}';
    }

}

