package lv.lu.training.lesson2.lesson11.statement;

import lv.lu.training.lesson2.lesson11.transaction.Transaction;

import java.math.RoundingMode;
import java.time.format.DateTimeFormatter;

public class Statement {
    private static final DateTimeFormatter DATE_TIME_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");

    private final String fromAccountNumber;
    private final String toAccountNumber;
    private final String amount;
    private final String transactionStatus;
    private final String transactionDateTime;
    private final String errorMessage;

    public Statement(Transaction transaction, String statementAccountNumber) {
        this.fromAccountNumber = transaction.getFromAccountNumber();
        this.toAccountNumber = transaction.getToAccountNumber();
        amount = parseAmount(transaction, statementAccountNumber);
        this.transactionStatus = transaction.getStatus().toString().toLowerCase();
        this.transactionDateTime = transaction.getCreatedAt().format(DATE_TIME_FORMAT);
        this.errorMessage = transaction.getFailureMessage();
    }


    private String parseAmount(Transaction transaction, String statementAccountNumber) {
        final String transferAmount = transaction.getAmount().setScale(2, RoundingMode.HALF_UP).toPlainString();
        return getAmountPrefix(transaction, statementAccountNumber) + transferAmount;
    }

    private String getAmountPrefix(Transaction transaction, String statementAccountNumber) {
        return statementAccountNumber.equals(transaction.getFromAccountNumber())
                ? "-"
                : "";
    }

    public String getFromAccountNumber() {
        return fromAccountNumber;
    }

    public String getToAccountNumber() {
        return toAccountNumber;
    }

    public String getAmount() {
        return amount;
    }

    public String getTransactionStatus() {
        return transactionStatus;
    }

    @Override
    public String toString() {
        return fromAccountNumber + "    "
                + toAccountNumber + "   "
                + amount + "    "
                + transactionDateTime + "   "
                + transactionStatus + "     "
                + (errorMessage != null ? errorMessage : "");
    }
}
