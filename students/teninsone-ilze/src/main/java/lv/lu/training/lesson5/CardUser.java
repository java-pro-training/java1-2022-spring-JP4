package lv.lu.training.lesson5;


import java.time.LocalDate;
//IESK
public class CardUser {
    public static void main(String[] args) {
        BankCard myCard = new BankCard("Banka Citadele", "Visa", "Ilze Teninsone", "23456666", LocalDate.of(2023, 12, 10), "134", 100);
        System.out.println("Mana karte:" + myCard);

        myCard.addFunds(100);
        System.out.println(myCard);

        myCard.withdraw(20);
        System.out.println(myCard);

    }
}