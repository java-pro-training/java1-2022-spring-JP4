package lv.lu.training.lesson5;

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
    public void withdraw (double value) {
        this.balance -= value;
    }
    public void addFounds (double value){
        this.balance += value;
    }

}
