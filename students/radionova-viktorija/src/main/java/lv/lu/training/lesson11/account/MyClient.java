package lv.lu.training.lesson11.account;

import lv.lu.training.lesson11.PaymentSystem;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MyClient {
    public static void main(String[] args) {
        MyClient client = new MyClient();
        client.run();
    }

    private void run() {
        PaymentSystem paymentSystem = new PaymentSystem(new HashMap<>(), new ArrayList<>());

        final String bobsAccountNumber = paymentSystem.createAccount(100).getNumber();
        final String janeAccountNumber = paymentSystem.createAccount(10).getNumber();

        paymentSystem.doTransaction(bobsAccountNumber, janeAccountNumber, 70);
        paymentSystem.doTransaction(janeAccountNumber, bobsAccountNumber, 120);
        paymentSystem.doTransaction(bobsAccountNumber, janeAccountNumber, 90);

        List<lv.lu.training.lesson11.statement.Statement> allStatements = paymentSystem.findAllStatementsFor(bobsAccountNumber);
        allStatements.forEach(System.out::println);
    }

}

