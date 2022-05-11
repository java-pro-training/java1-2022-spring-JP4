package lv.lu.training.lesson5;

import java.time.LocalDate;

public class BankCard {
    private String bankName;
    private String origin;
    private String holderName;
    private String number;
    private LocalDate expirateDate;
    private String cvv;
    private double balance;

    public BankCard(String bankName, String origin, String holderName, String number, LocalDate expirateDate, String cvv, double balance) {
        this.bankName = bankName;
        this.origin = origin;
        this.holderName = holderName;
        this.number = number;
        this.expirateDate = expirateDate;
        this.cvv = cvv;
        this.balance = balance;
    }

    public void withdraw(double value) {
        this.balance -= value;

    }

    public void addFonds(double value) {
        this.balance += value;
    }
}
