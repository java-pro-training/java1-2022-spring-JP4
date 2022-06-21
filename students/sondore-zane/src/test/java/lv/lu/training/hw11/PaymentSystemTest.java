package lv.lu.training.hw11;

import lv.lu.training.hw11.account.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static lv.lu.training.hw11.account.AccountStatus.ACTIVE;
import static org.junit.jupiter.api.Assertions.*;

class PaymentSystemTest {
    private PaymentSystem victim;
    private Map<String, Account> allAccounts;

    @BeforeEach
    private void setUp(){
        allAccounts = new HashMap<>();
        victim = new PaymentSystem(allAccounts);

    }
    @Test
    void shouldCreatAccount(){
        Account result = victim.creatAccount(10d);

        assertNotNull(result);
        assertNotNull(result.getNumber());
        assertEquals(21, result.getNumber().length());
        assertEquals(ACTIVE, result.getStatus());
        assertEquals(BigDecimal.valueOf(10d), result.getBalance());
    }

    @Test
    void shouldStoreAccountOnCreation(){
        Account createdAccount = victim.creatAccount(5d);
        assertEquals(createdAccount, allAccounts.get(createdAccount.getNumber());
    }
}