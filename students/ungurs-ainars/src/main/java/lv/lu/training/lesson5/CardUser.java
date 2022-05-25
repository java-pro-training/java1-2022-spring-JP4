package lv.lu.training.lesson5;

import java.time.LocalDate;
//IESK
public class CardUser {
    public static void main(String[] args) {
        BankCard myCard = new BankCard("Banka Citadele", "Visa", "Roberts Polis", "2345678345", LocalDate.of(2024, 12, 10), "134", 100);
        System.out.println("Mana karte: " + myCard);

        myCard.addFunds(100d);
        System.out.println("Mana karte: " + myCard);

        myCard.withdraw(20d);
        System.out.println("Mana karte: " + myCard);
    }
}
