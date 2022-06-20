package lv.lu.training.lesson11.transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Transaction {

    private final String fromAccount;
    private final String toAccount;
    private final BigDecimal ammount;
    private final LocalDateTime createdAt;
    private TransactionStatus status;
    private String failureMessage;

    public String getFromAccount() {
        return fromAccount;
    }

    public String getToAccount() {
        return toAccount;
    }

    public BigDecimal getAmmount() {
        return ammount;
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
}
