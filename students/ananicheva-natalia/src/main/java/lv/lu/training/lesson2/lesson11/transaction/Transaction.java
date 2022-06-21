package lv.lu.training.lesson2.lesson11.transaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {
    private final String fromAccountNumber;
    private final String toAccountNumber;
    private final BigDecimal amount;
    private final LocalDateTime createdAt;
    private TransactionStatus status;
    private String failureMessage;

    public Transaction(String fromAccount, String toAccount, BigDecimal amount) {
        this.fromAccountNumber = fromAccount;
        this.toAccountNumber = toAccount;
        this.amount = amount;
        this.createdAt = LocalDateTime.now();
        this.status = TransactionStatus.PENDING;
    }

    public String getFromAccountNumber() {
        return fromAccountNumber;
    }

    public String getToAccountNumber() {
        return toAccountNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public String getFailureMessage() {
        return failureMessage;
    }

    public Transaction success() {
        this.status = TransactionStatus.SUCCESS;
        return this;
    }

    public Transaction fail(String message) {
        this.status = TransactionStatus.FAILURE;
        this.failureMessage = message;
        return this;
    }
}
