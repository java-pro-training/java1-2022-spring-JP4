package lv.lu.training.HW5;

public class BankAccount {
    private String accountNumber;
    private String pinCode;
    private double debetBalance;
    private double creditLimits;
    private double usedCredit;


    public BankAccount(String accountNumber, String pinCode, double debetBalance, double creditLimits, double usedCredit) {
        this.accountNumber = accountNumber;
        this.creditLimits = creditLimits;
        this.debetBalance = debetBalance;
        this.pinCode = pinCode;
        this.usedCredit = usedCredit;
    }
    public void topUp (double value){
        System.out.println("Notiek naudas iemaksa");
    }
    public void withDraw (double value) {
        System.out.println("Notiek naudas izmaksa");
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

    public double getDebetBalance() {
        return debetBalance;
    }

    public void setDebetBalance(double debetBalance) {
        this.debetBalance = debetBalance;
    }

    public double getCreditLimits() {
        return creditLimits;
    }

    public void setCreditLimits(double creditLimits) {
        this.creditLimits = creditLimits;
    }

    public double getUsedCredit() {
        return usedCredit;
    }

    public void setUsedCredit(double usedCredit) {
        this.usedCredit = usedCredit;
    }
}
