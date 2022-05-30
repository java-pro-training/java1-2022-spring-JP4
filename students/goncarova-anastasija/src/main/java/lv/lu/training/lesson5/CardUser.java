package lv.lu.training.lesson5;

import java.time.LocalDate;

public class CardUser {
    public static void main(String[] args) {
        BankCard myCard = new BankCard("Citadele", "Visa", "Anastasija Goncarova", "698847562132", LocalDate.of(2024, 12, 10), "524", 100);

        printCard(myCard);
    }

    public static void printCard(BankCard card) {
        System.out.println(card);

    }
}
