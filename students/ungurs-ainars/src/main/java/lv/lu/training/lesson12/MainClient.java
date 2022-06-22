package lv.lu.training.lesson12;

import lv.lu.training.lesson12.statement.Statement;

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

        paymentSystem.doTransaction(bobsAccountNumber, janeAccountNumber, 50);
        paymentSystem.doTransaction(janeAccountNumber, bobsAccountNumber, 100);
        paymentSystem.doTransaction(bobsAccountNumber, janeAccountNumber, 70);

        List<Statement> allStatements = paymentSystem.findAllStatementsFor(bobsAccountNumber);
        allStatements.forEach(System.out::println);
    }
}
