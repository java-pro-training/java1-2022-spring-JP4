package lv.lu.training.lesson5.HW5;

import java.time.LocalDate;
//LABOT
public class CardUser {
    public static void main(String[] args) {
        BankCard myCard = new BankCard("BankaCitadele", "Visa", "Valeria Zalygina", "111111111", LocalDate.of(2025, 12, 31), "123", "100");
        System.out.println("manaKarte" + myCard);
        //trūks addFunds un withDraw metodes izmantoša, tik tālu viss pareizi
    }
}
