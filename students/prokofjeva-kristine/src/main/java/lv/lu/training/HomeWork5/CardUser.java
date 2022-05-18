package lv.lu.training.HomeWork5;

import java.time.LocalDate;
//IESK
public class CardUser {
    public static void main(String[] args) {
        BankCard myCard = new BankCard("Citadele", "VISA", "Kristine Prokofjeva", "34567", LocalDate.of(2024, 12, 10), "990", 100);
        System.out.println("Mana karte: " + myCard);
        myCard.addFounds(100d);
        System.out.println("Mana karte: " + myCard);
        myCard.withdrawal(20d);
        System.out.println("Mana karte: " + myCard);


    }
}

