package lv.lu.training.lesson2.lesson5;

import java.time.LocalDate;

public class CardUser {
    public static void main(String[] args) {
        BankCard myCard = new BankCard("Banka Luminor", "Visa", "Lauma Kaule", "125668596", LocalDate.of(2024, 12, 10), "366", 100);
        System.out.println("Mana karte " + myCard);
myCard.addFonds(100d);
        System.out.println(myCard);
        myCard.withdraw(20d);
        System.out.println(myCard);
    }
}


