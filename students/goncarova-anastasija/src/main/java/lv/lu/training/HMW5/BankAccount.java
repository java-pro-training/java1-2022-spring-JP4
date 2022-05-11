package lv.lu.training.HMW5;

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

    public void topUp(String pin, double amount) {
        if (pinCode.equals(pin)) {
            if (this.usedCredit > amount) {
                this.usedCredit -= amount;
            } else {
                double balance = amount - this.usedCredit;
                this.debitBalance += balance;
                this.usedCredit = 0;
            }
        } else {
            System.out.println("Incorrect pin!");
        }
    }


    public void withdraw(String pin, double amount) {
        double available = creditLimit - usedCredit + debitBalance;
        if (pin.equals(pinCode)) {
            if (this.debitBalance > amount) {
                this.debitBalance -= amount;
            } else if (available >= amount) {
                this.usedCredit += (amount - debitBalance);
                this.debitBalance = 0;
            } else {
                System.out.println("Not enough money!");
            }
        } else {
            System.out.println("Incorrect pin!");
        }
    }


    @Override
    public String toString() {
        return "BankAccount{" +
                "debitBalance=" + debitBalance +
                ", creditLimit=" + creditLimit +
                ", usedCredit=" + usedCredit +
                '}';
    }
}

