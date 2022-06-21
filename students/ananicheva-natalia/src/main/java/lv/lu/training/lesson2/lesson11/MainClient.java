package lv.lu.training.lesson2.lesson11;

import lv.lu.training.lesson2.lesson11.statement.Statement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainClient {
    public static void main(String[] args) {
        MainClient client = new MainClient();
        client.run();
    }

    private void run() {
        PaymentSystem paymentSystem = new PaymentSystem(new HashMap<>(), new ArrayList<>());

        final String bobsAccountNumber = paymentSystem.createAccount(100).getNumber();
        final String janeAccountNumber = paymentSystem.createAccount(10).getNumber();

        paymentSystem.doTransaction(bobsAccountNumber, janeAccountNumber, 70);
        paymentSystem.doTransaction(janeAccountNumber, bobsAccountNumber, 120);
        paymentSystem.doTransaction(bobsAccountNumber, janeAccountNumber, 90);

        List<Statement> allStatements = paymentSystem.findAllStatementsFor(bobsAccountNumber);
        allStatements.forEach(System.out::println);
    }

}
