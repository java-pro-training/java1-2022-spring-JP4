package lv.lu.training.HomeWorkGala.statement;

import lv.lu.training.HomeWorkGala.transaction.Transaction;

import javax.swing.*;
import java.math.RoundingMode;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Statement {
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd:mm:ss");

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
        this.transactionDateTime = transaction.getCreatedAt().format(DATE_TIME_FORMATTER);
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
        return fromAccountNumber + "  "
                + toAccountNumber + "  "
                + amount + "  "
                + transactionDateTime + "  "
                + transactionStatus + "  "
                + (errorMessage != null ? errorMessage : " ");
    }
}

