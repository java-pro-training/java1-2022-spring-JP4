package lv.lu.training.lesson5.HW1;

import java.time.LocalDate;

public class CardUser {
    public static void main(String[] args) {
        BankCard myCard = new BankCard("Banka Citadele", "Visa", "Aleksandrs Andrejevs", "2304931811", LocalDate.of(2025, 12, 31), "777");
        System.out.println("Mana karte: " + myCard);
        myCard.addFunds(100d);
        System.out.println("Mana karte: " + myCard);
        myCard.withdraw(20d);
        System.out.println("Mana karte: " + myCard);
    }
}
