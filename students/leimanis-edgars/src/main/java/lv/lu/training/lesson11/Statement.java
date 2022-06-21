package lv.lu.training.lesson11;

import lv.lu.training.lesson11.transaction.Transaction;

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

    public Statement(String fromAccountNumber, String toAccountNumber, String amount, String transactionStatus, String transactionDateTime, String errorMessage) {
        this.fromAccountNumber = fromAccountNumber;
        this.toAccountNumber = toAccountNumber;
        this.amount = amount;
        this.transactionStatus = transactionStatus;
        this.transactionDateTime = transactionDateTime;
        this.errorMessage = errorMessage;
    }

    private String parseAmount(Transaction transaction, String statementAccountNumber) {
        final String transferAmount = transaction.getAmount().setScale(2, RoundingMode.HALF_UP).toPlainString();
        return getAmountPrefix(transaction, statementAccountNumber) + transferAmount;
        private String getAmountPrefix (Transaction transaction, String statementAccountNumber){
            return statementAccountNumber.equals(transaction.getFromAccountNumber())
                    ? "-"
                    : "";
        }
        public String getFromAccountNumber () {
            return fromAccountNumber;
        }

        public String getToAccountNumber () {
            return toAccountNumber;
        }

        public String getAmount () {
            return amount;
        }

        public String getTransactionStatus () {
            return transactionStatus;
        }
    }

    @Override
    public String toString() {
        return "Statement{" +
                "fromAccountNumber='" + fromAccountNumber + '\'' +
                ", toAccountNumber='" + toAccountNumber + '\'' +
                ", amount='" + amount + '\'' +
                ", transactionStatus='" + transactionStatus + '\'' +
                ", transactionDateTime='" + transactionDateTime + '\'' +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}