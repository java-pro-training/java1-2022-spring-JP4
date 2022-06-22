package lv.lu.training.HomeWorkGala.account;

import lv.lu.training.HomeWorkGala.transaction.Transaction;

import java.math.BigDecimal;

public class Account {

    private final String number;
    private AccountStatus status;
    private BigDecimal balance;

    public Account(String number, AccountStatus status, BigDecimal balance) {
        this.number = number;
        this.status = status;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Transaction topUp(Account fromAccount, double amount) {
        final BigDecimal amountBigDecimal = BigDecimal.valueOf(amount);
        final Transaction transaction = new Transaction(fromAccount.getNumber(), getNumber(), amountBigDecimal);
        try {
            fromAccount.decreaseBalanceBy(amountBigDecimal);
            this.balance = this.balance.add(amountBigDecimal);
        } catch (IllegalArgumentException ex) {
            return transaction.fail(ex.getMessage());
        }
        return transaction.success();
    }

    private void decreaseBalanceBy(BigDecimal amount) {
        BigDecimal decreasedBalance = this.balance.subtract(amount);
        validateAmount(decreasedBalance);
        this.balance = decreasedBalance;
    }

    private void validateAmount(BigDecimal amount) {
        if (BigDecimal.ZERO.compareTo(amount) > 0) {
            throw new IllegalArgumentException("Insuficient funds");

        }
    }
}
