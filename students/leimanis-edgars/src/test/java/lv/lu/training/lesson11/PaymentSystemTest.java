package lv.lu.training.lesson11;

import lv.lu.training.lesson11.account.Account;
import lv.lu.training.lesson11.transaction.Transaction;
import lv.lu.training.lesson11.transaction.TransactionStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static lv.lu.training.lesson11.account.AccountStatus.ACTIVE;
import static org.junit.jupiter.api.Assertions.*;

class PaymentSystemTest {

    private PaymentSystem victim;
    private Map<String, Account> allAccounts;
    private List<Transaction> allTransactions;

    @BeforeEach
    private void setUp() {
        allAccounts = new HashMap<>();
        allTransactions = new ArrayList<>();
        victim = new PaymentSystem(allAccounts, allTransactions);
    }

    @Test
    void shouldCreateAccount() {
        Account result = victim.createAccount(10d);

        assertNotNull(result); //Pārbauda vai objekts nav null
        assertNotNull(result.getNumber());
        assertEquals(22, result.getNumber().length());
        assertEquals(ACTIVE, result.getStatus());
        assertEquals(BigDecimal.valueOf(10d), result.getBalance());
    }

    @Test
    void shouldStoreAccountOnCreation() {
        Account createdAccount = victim.createAccount(5d);
        assertEquals(createdAccount, allAccounts.get(createdAccount.getNumber()));
    }

    @Test
    void shouldTransferAmountFromOneAccountToAnother() {
        allAccounts.put("123", new Account("123", ACTIVE, BigDecimal.valueOf(100)));
        allAccounts.put("456", new Account("456", ACTIVE, BigDecimal.valueOf(90)));

        victim.doTransaction("123", "456", 50);

        assertEquals(BigDecimal.valueOf(140d), allAccounts.get("456").getBalance());
        assertEquals(BigDecimal.valueOf(50d), allAccounts.get("123").getBalance());
    }

    @Test
    void shouldTransferAmountAndStoreTransaction() {
        allAccounts.put("123", new Account("123", ACTIVE, BigDecimal.valueOf(100)));
        allAccounts.put("456", new Account("456", ACTIVE, BigDecimal.valueOf(90)));

        victim.doTransaction("123", "456", 50);

        assertEquals(1, allTransactions.size());
        Transaction transaction = allTransactions.get(0);
        assertNotNull(transaction);
        assertEquals("123", transaction.getFromAccountNumber());
        assertEquals("456", transaction.getToAccountNumber());
        assertEquals(BigDecimal.valueOf(50d), transaction.getAmount());
        assertEquals(TransactionStatus.SUCCESS, transaction.getStatus());
    }

    @Test
    void shouldFindAllStatements() {
        Transaction transaction = new Transaction("123", "456", BigDecimal.TEN).success();
        Transaction transaction2 = new Transaction("456", "123", BigDecimal.valueOf(11)).success();
        allTransactions.add(transaction);
        allTransactions.add(transaction2);

        List<Statement> result = victim.findAllStatementsFor("123");

        assertNotNull(result);
        assertEquals(2, result.size());

        Statement creditStatement = result.get(0);
        assertEquals("123", creditStatement.getFromAccountNumber());
        assertEquals("456", creditStatement.getToAccountNumber());
        assertEquals("-10.00", creditStatement.getAmount());
        assertEquals("success", creditStatement.getTransactionStatus());

        Statement debitStatement = result.get(1);
        assertEquals("456", debitStatement.getFromAccountNumber());
        assertEquals("123", debitStatement.getToAccountNumber());
        assertEquals("11.00", debitStatement.getAmount());
        assertEquals("success", debitStatement.getTransactionStatus());
    }
}