package lv.lu.training.lesson5;

import java.time.LocalDate;
//LABOT
public class CardUser {
    public static void main(String[] args) {
        BankCard myCard = new BankCard("BankaCitadele", "Visa", "ZaneSondore", "5411057", LocalDate.of(2024,12, 10), "458", 100);
        //Trūkst metodes-  addFunds un withdraw izmantošana, tik tālu viss ok.
    }
}
