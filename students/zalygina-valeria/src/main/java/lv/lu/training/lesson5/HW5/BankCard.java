package lv.lu.training.lesson5.HW5;

import java.time.LocalDate;

public class BankCard {
    private String bankName;
    private String origin;
    private String holderName;
    private String number;
    private String expireDate;
    private String cvv;
    private double balance;

    public BankCard(String bankName, String origin, String holderName, String number, LocalDate expireDate, String cvv, String balance) {
        this.bankName = bankName;
        this.origin = origin;
        this.holderName = holderName;
        this.number = number;
        this.expireDate = "2024-12-31";
        this.cvv = cvv;
        this.balance = 100;
    }
    public void withdrew(double value){
        this.balance -= value;
    }
    public void addFonds(double value){
        this.balance += value;
    }

    @Override
    public String toString() {
        return "BankCard{" +
                "bankName='" + bankName + '\'' +
                ", origin='" + origin + '\'' +
                ", holderName='" + holderName + '\'' +
                ", number='" + number + '\'' +
                ", expireDate='" + expireDate + '\'' +
                ", cvv='" + cvv + '\'' +
                ", balance='" + balance + '\'' +
                '}';
    }
}
