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


}
