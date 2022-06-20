package lv.lu.training.lesson11.transaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {

    private final String fromAccount;
    private final String toAccount;
    private final BigDecimal ammount;
    private final LocalDateTime createdAt;
    private TransactionStatus status;
    private String failureMessage;

    public Transaction(String fromAccount, String toAccount, BigDecimal ammount) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.ammount = ammount;
        this.createdAt = LocalDateTime.now();
        this.status = TransactionStatus.PENDING;
    }

    public String getFromAccount() {
        return fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public BigDecimal getAmmount() {
        return ammount;
    }

    public TransactionStatus getStatus() {
        return status;
    }

    public String getFailureMessage() {
        return failureMessage;
    }

    public Transaction success(){
        this.status = TransactionStatus.SUCCESS;
        return this;
    }

    public Transaction fail(String message){
        this.status = TransactionStatus.FAILURE;
        this.failureMessage = message;
        return this;
    }
}
