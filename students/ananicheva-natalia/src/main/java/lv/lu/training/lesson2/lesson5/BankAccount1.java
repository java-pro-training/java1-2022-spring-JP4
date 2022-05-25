package lv.lu.training.lesson2.lesson5;

import java.util.Scanner;

public class BankAccount1 {
    private String accountNumber;
    private double balance;
    private double creditLimit;
    private double usedCredit;
    private String pinCode;
    private double avalibleAmount = balance + (creditLimit - usedCredit);

    public BankAccount1(String accountNumber, double balance, double creditLimit, double usedCredit, String pinCode) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.creditLimit = creditLimit;
        this.usedCredit = usedCredit;
        this.pinCode = pinCode;
    }

    public void withDraw(double value) {
        Scanner sumWithDraw = new Scanner(System.in);
        System.out.println("enter sum you want to withdraw");
        double enteredSumWithDraw = sumWithDraw.nextDouble();
        if ((enteredSumWithDraw <= creditLimit) && (enteredSumWithDraw >= balance)) {
            this.usedCredit = this.usedCredit + (enteredSumWithDraw - this.balance);
            this.balance = 0;
        }
        System.out.println("Cash withdraw is in progress");
        if ((enteredSumWithDraw <= creditLimit) && (enteredSumWithDraw < balance)) {
            this.balance = this.balance - enteredSumWithDraw;
        }
        System.out.println("Cash withdraw is in progress");
        if ((enteredSumWithDraw <= creditLimit) && (enteredSumWithDraw <= avalibleAmount)) {
            this.usedCredit = enteredSumWithDraw - this.balance + this.usedCredit;
            this.balance = 0;
        }
        System.out.println("withdraw is not possible");

    }

    public void topUp(double value) {
        Scanner sumTopUp = new Scanner(System.in);
        System.out.println("enter sum you want to top up");
        double enteredSumTopUp = sumTopUp.nextDouble();
        if (enteredSumTopUp >= usedCredit) {
            this.balance = enteredSumTopUp - this.usedCredit + this.balance;
            this.usedCredit = 0;
        }
        if (enteredSumTopUp < usedCredit) {
            this.usedCredit = usedCredit - enteredSumTopUp;
        }
        System.out.println("Cash top up is in progress");
    }

    @Override
    public String toString() {
        return "BankAccount1{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", usedCredit=" + usedCredit +
                ", pinCode='" + pinCode + '\'' +
                ", avalibleAmount=" + avalibleAmount +
                '}';
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getUsedCredit() {
        return usedCredit;
    }

    public void setUsedCredit(double usedCredit) {
        this.usedCredit = usedCredit;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

}

