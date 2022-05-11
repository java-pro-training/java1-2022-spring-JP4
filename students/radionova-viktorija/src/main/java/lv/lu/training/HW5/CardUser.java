package lv.lu.training.HW5;

import java.time.LocalDate;

public class CardUser {
    private static String[] args;

    public static void main(String[] args) {
        BankCard myCard = new BankCard("Citadele", "Visa", "Viktorija", "52637492097", LocalDate.of(2024, 12, 10), "435", 100);
        System.out.println("Mana karte: " + myCard);

        myCard.addFunds(100);
        System.out.println("Mana karte: " + myCard);

        myCard.withdrawal(30);
        System.out.println("Mana karte: " + myCard);
    }

}
