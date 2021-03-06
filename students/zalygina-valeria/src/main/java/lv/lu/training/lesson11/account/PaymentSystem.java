package lv.lu.training.lesson11.account;

import java.math.BigDecimal;
import java.util.Map;

public class PaymentSystem {

    private final Map<String, Account> allAccounts;
    private int accountCounter = 1;

    public PaymentSystem(Map<String, Account> allAccounts) {
        this.allAccounts = allAccounts;
    }
    public Account createAccount(double initialAmount){
        final String accountNumber = String.format("%s%012d", "LV34PARX17",accountCounter++);
        Account account=new Account(accountNumber, AccountStatus.ACTIVE, BigDecimal.valueOf(initialAmount));
        allAccounts.put(accountNumber, account);
        return account;
    }
}
