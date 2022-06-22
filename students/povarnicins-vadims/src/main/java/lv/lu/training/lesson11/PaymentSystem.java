package lv.lu.training.lesson11;

import lv.lu.training.lesson11.account.Account;
import lv.lu.training.lesson11.account.AccountStatus;
import lv.lu.training.lesson11.statement.Statement;
import lv.lu.training.lesson11.transaction.Transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PaymentSystem {


    private final Map<String, Account> allAccounts;
    private final List<Transaction> allTransactions;
    private int accountCounter = 1;

    public PaymentSystem(Map<String, Account> allAccounts, List<Transaction> allTransactions) {
        this.allAccounts = allAccounts;
        this.allTransactions = allTransactions;
    }

    public Account createAccount(double initialAmount) {
        final String accountNumber = String.format("%s%012d", "LV34PARX17", accountCounter++);
        Account account = new Account(accountNumber, AccountStatus.ACTIVE, BigDecimal.valueOf(initialAmount));
        allAccounts.put(accountNumber, account);
        return account;
    }

    public void doTransaction(String fromAccountNumber, String toAccountNumber, double amount) {
        Account fromAccount = allAccounts.get(fromAccountNumber);
        Account toAccount = allAccounts.get(toAccountNumber);

        Transaction transaction = toAccount.topUp(fromAccount, amount);
        allTransactions.add(transaction);
    }

    public List<Statement> findAllStatementsFor(String accountNumber) {
        List<Statement> result = new ArrayList<>();
        for (Transaction transaction : allTransactions) {
            if (transaction.getFromAccountNumber().equals(accountNumber)
                    || transaction.getToAccountNumber().equals(accountNumber)) {
                final Statement statement = new Statement(transaction, accountNumber);
                result.add(statement);
            }
        }
        return result;
    }
}
