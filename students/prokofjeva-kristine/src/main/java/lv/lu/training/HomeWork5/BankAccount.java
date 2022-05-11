package lv.lu.training.HomeWork5;

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
    public boolean topUp(double amount, String pinCode) {
        double availableAmount = debitBalance + (creditLimit - usedCredit);
        boolean isEnoughMoney = availableAmount - amount > 0.001;

        return isEnoughMoney;}




            public void withDraw () {
            }

            public void topUp () {
            }


            public void topUp (String pinCode,double value){
            }

            public void withDraw (String pinCode,double value){
            }

            @Override
            public String toString () {
                return "BankAccount{" +
                        "accountNumber='" + accountNumber + '\'' +
                        ", pinCode='" + pinCode + '\'' +
                        ", debitBalance=" + debitBalance +
                        ", creditLimit=" + creditLimit +
                        ", usedCredit=" + usedCredit +
                        '}';
            }

}



