package lv.lu.training.homework5;

import java.time.LocalDate;
//IESK
public class CardUser {
    public static void main(String[] args) {
        BankCard myCard = new BankCard("Swedbank", "MasterCard", "Edgars Leimanis", "0000 1111 2222 3333", LocalDate.of(2022, 11, 18), "999", 1000);

        System.out.println("Mana karte " + myCard);

        myCard.addFunds(100d);

        System.out.println("Mana karte " + myCard);

        myCard.withdraw(20d);

        System.out.println("Mana karte " + myCard);

    }
}
