package lv.lu.training.HMW5;

import java.time.LocalDate;
//IESK
public class CardUser {
    public static void main(String[] args) {
        BankCard myCard = new BankCard("Citadele", "Visa", "Anastasija Goncarova", "698847562132", LocalDate.of(2024, 12, 10), "524", 100);
        System.out.println("Mana karte " + myCard);

        myCard.addFounds(100d);
        System.out.println("Mana karte " + myCard);

        myCard.withdraw(20d);
        System.out.println("Mana karte " + myCard);

    }

}
