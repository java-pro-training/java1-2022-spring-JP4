package lv.lu.training.homework5;

public class BankAccount {
    private String accountNumber;
    private String pinCode;
    private double debitBalance;
    private double creditLimit;
    private double usedCredit;


    public BankAccount(String accountNumber, String pinCode, double debitBalance, double creditlimit, double usedCredit) {
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
        this.debitBalance = debitBalance;
        this.creditLimit = creditlimit;
        this.usedCredit = usedCredit;
    }

    public void whitDraw(double value) {
        System.out.println("Notiek naudas izmaksa");
        //this.pinCode -=value;
    }

    public void topUp(double value) {
        System.out.println("Notiek naudas iemaksa");
        //this.pinCode +=value;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public double getDebitBalance() {
        return debitBalance;
    }

    public void setDebitBalance(double debitBalance) {
        this.debitBalance = debitBalance;
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
}
