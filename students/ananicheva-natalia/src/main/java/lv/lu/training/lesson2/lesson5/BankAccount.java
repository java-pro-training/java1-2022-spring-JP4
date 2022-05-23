package lv.lu.training.lesson2.lesson5;

public class BankAccount {

    private String accountNumber;
    private String pinCode="1234";
    private double balance;
    private double creditLimit;
    private double usedCredit;
    private double amount;
private double avalibleAmount=balance+(creditLimit-usedCredit);

    public BankAccount(String accountNumber, double balance, double creditLimit, double usedCredit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.creditLimit = creditLimit;
        this.usedCredit = usedCredit;

    }

    public String getPinCode() {
        return pinCode;
    }

    public void topUp(String pin,double value){
        if (pin.equals(getPinCode())&&(value>=usedCredit)){
            System.out.println("pin is correct");
                this.amount+=value;
                this.balance=value-this.usedCredit+this.balance;
                this.usedCredit=0;
            }if (pin.equals(getPinCode())&&(value<usedCredit)){
            this.amount+=value;
            this.usedCredit=usedCredit-value;

        }}

    public void withdraw(String pin,double value){
        if (pin.equals(getPinCode())&&(value<=creditLimit)&&(value<=balance)) {
        this.amount-=value;
        this.balance=this.balance-value;
        this.usedCredit=this.usedCredit+value;}
        if(pin.equals(getPinCode())&&(value<=creditLimit)&&(value<=avalibleAmount)){
this.amount-=value;
this.usedCredit=value-balance+this.usedCredit;
this.balance=0;
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
                ", amount=" + amount +
                '}';
    }
}





