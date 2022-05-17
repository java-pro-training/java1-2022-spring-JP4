package lv.lu.training.lesson5;

public class BankAccount {

    private String accountNumber;
    private String pinCode;
    private double debitBalance;
    private double creditLimit;
    private double usedCredit;

    public BankAccount(String accountNumber, String pinCode, double debitBalance, double creditLimit, double usedCredit) {
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
        this.debitBalance = debitBalance;
        this.creditLimit = creditLimit;
        this.usedCredit = usedCredit;
    }

    public void topUp(String pin, double value) {
        if (pinCode.equals(pin)) {
            if (this.usedCredit > value) {
                this.usedCredit -= value;
            } else {
                double atlikums = value - this.usedCredit;
                this.debitBalance += atlikums;
                this.usedCredit = 0;
            }
        } else {
            System.out.println("Incorrect pin!");
        }
    }

    public void withdraw(String pin, double value) {
        double available = creditLimit - usedCredit + debitBalance;
        if (pinCode.equals(pin)) {
            if (this.debitBalance > value) {
                this.debitBalance -= value;
            } else if (available >= value) {
                this.usedCredit += (value - debitBalance);
                this.debitBalance = 0;
            } else {
                System.out.println("Not enough funds!");
            }
        } else {
            System.out.println("Incorrect pin!");
        }
    }


    @Override
    public String toString() {
        return "Debit balance = " + debitBalance + " / "
                + "Credit limit = " + creditLimit + " / "
                + "Used credit = " + usedCredit;
    }
}
