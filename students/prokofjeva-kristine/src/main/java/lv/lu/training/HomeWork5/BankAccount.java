package lv.lu.training.HomeWork5;

public class BankAccount {
    private String accountNumber;
    private String pinCode;
    private double debitBalance;
    private double creditLimit;
    private double usedCredit;

    public BankAccount(String accountNumber, String pinCode, double debitBalance, double creditLimit, double usedCredit){
        this.accountNumber = accountNumber;
        this.pinCode = pinCode;
        this.debitBalance = debitBalance;
        this.creditLimit = creditLimit;
        this.usedCredit = usedCredit;

    }
    public void withdrawal(double value){
        this.debitBalance -= value;}


}
