package lv.lu.training.lesson5.HW2;

public class BankAccount {
    private String accountNumber;
    private String pinCode;
    private double balance;
    private double creditLimit;
    private double usedCredit;

    public BankAccount(String accountNumber, String pinCode, double balance, double creditLimit, double usedCredit) {
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
        this.balance = balance;
        this.creditLimit = creditLimit;
        this.usedCredit = usedCredit;
    }

    public void withDraw(double value, String userPinCode) {
        if (withDrawValue(value) == true && userPinCode.equals(pinCode)) {
            if (value >= balance) {
                this.usedCredit += value - balance;
                this.balance = 0;
            } else {
                this.balance -= value;
            }
        } else if (withDrawValue(value) == false && userPinCode.equals(pinCode)) {
            System.out.println("Nepietiek naudas");
        } else {
            System.out.println("Nepareizs PIN");
        }
    }

    public void addFunds(double value, String userPinCode) {
        if (userPinCode.equals(pinCode)) {
            if (this.usedCredit == 0) {
                this.balance += value;
            } else if (this.usedCredit > value) {
                this.usedCredit -= value;
            } else {
                this.balance += value - this.usedCredit;
                this.usedCredit = 0;
            }
        }else{
            System.out.println("Nepareizs PIN");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", usedCredit=" + usedCredit +
                '}';
    }

    public boolean withDrawValue(double value) {
        double availableLimit = balance + (creditLimit - usedCredit);
        boolean isEnoughMoney = availableLimit - value >= 0;
        return isEnoughMoney;


    }

}
