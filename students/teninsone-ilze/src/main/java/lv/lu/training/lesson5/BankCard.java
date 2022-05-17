package lv.lu.training.lesson5;

import java.time.LocalDate;
//IESK
public class BankCard {
    private String bankName;
    private String origin;
    private String holderName;
    private String number;
    private LocalDate expiryDate;
    private String cvv;
    private double balance;


    public BankCard(String bankName, String origin, String holderName, String number, LocalDate expiryDate, String cvv, double balance) {
        this.bankName = bankName;
        this.origin = origin;
        this.holderName = holderName;
        this.number = number;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.balance = balance;
    }
        public void withdraw(double value){
            this.balance -= value;
        }



        public void addFunds(double value){
            this.balance +=value;
        }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BankCard bankCard = (BankCard) o;

        if (Double.compare(bankCard.balance, balance) != 0) return false;
        if (!bankName.equals(bankCard.bankName)) return false;
        if (!origin.equals(bankCard.origin)) return false;
        if (!holderName.equals(bankCard.holderName)) return false;
        if (!number.equals(bankCard.number)) return false;
        if (!expiryDate.equals(bankCard.expiryDate)) return false;
        return cvv.equals(bankCard.cvv);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = bankName.hashCode();
        result = 31 * result + origin.hashCode();
        result = 31 * result + holderName.hashCode();
        result = 31 * result + number.hashCode();
        result = 31 * result + expiryDate.hashCode();
        result = 31 * result + cvv.hashCode();
        temp = Double.doubleToLongBits(balance);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }


    @Override
    public String toString() {
        return "BankCard{" +
                "bankName='" + bankName + '\'' +
                ", origin='" + origin + '\'' +
                ", holderName='" + holderName + '\'' +
                ", number='" + number + '\'' +
                ", expiryDate=" + expiryDate +
                ", cvv='" + cvv + '\'' +
                ", balance=" + balance +
                '}';
    }
}
