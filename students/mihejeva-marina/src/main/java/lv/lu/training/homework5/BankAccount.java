package lv.lu.training.homework5;

public class BankAccount {

    private String accountNumber;
    private String pin;
    private double debitBlance;
    private double creditLimit;
    private double utilisedLimit;

    public BankAccount(String accountNumber, String pin, double debitBlance, double creditLimit, double utilisedLimit) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.debitBlance = debitBlance;
        this.creditLimit = creditLimit;
        this.utilisedLimit = utilisedLimit;
    }

    public boolean withdraw(double amount, String pinCode) {
        if (isPinCorrect(pinCode) && isEnoughMoney(amount)) {
            debitBlance = debitBlance - amount;
            if (debitBlance < 0.00) {
                utilisedLimit = utilisedLimit - debitBlance;
                debitBlance = 0.00;
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean topUp(double amount, String pinCode) {
        if (isPinCorrect(pinCode)) {
            double topUpAmount = amount - utilisedLimit;

            this.debitBlance += topUpAmount;
            this.utilisedLimit -= (amount - topUpAmount);
            return true;
        } else {
            return false;
        }
    }

    private boolean isPinCorrect(String pinCode) {
        return pinCode.equals(this.pin);
    }

    private boolean isEnoughMoney(double withdrawAmount) {
        double availableAmount = this.debitBlance + (this.creditLimit - this.utilisedLimit);
        //boolean isEnoughMoney = availableAmount - withdrawAmount > 0.001;
        return availableAmount - withdrawAmount >= 0.0;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", pin='" + pin + '\'' +
                ", debitBlance=" + debitBlance +
                ", creditLimit=" + creditLimit +
                ", utilisedLimit=" + utilisedLimit +
                '}';
    }
}
