package lv.lu.training.lesson5;

import java.time.LocalDate;

public class CartUser {
    public static void main(String[] args) {
        BankCard myCard = new BankCard("SebBank", "VISA", "Aleksandrs", "45326525235", LocalDate.of(2024, 12, 10), "123", 100);
        System.out.println("Mana karte: " + myCard);

        myCard.addFunds(100);
        System.out.println("Mana karte: " + myCard);
        myCard.withdraw(20);
        System.out.println("Mana karte: " + myCard);

    }


}
