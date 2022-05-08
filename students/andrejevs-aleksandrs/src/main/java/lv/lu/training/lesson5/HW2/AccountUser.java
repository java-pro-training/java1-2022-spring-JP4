package lv.lu.training.lesson5.HW2;

import java.util.Scanner;

public class AccountUser {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("LV56PARX0030246807863", "4893", 150, 300, 0);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mans konts " + myAccount);
        myAccount.withDraw(350,"4894");
        System.out.println(myAccount);
        myAccount.withDraw(350,"4893");
        System.out.println(myAccount);
        myAccount.withDraw(350,"4893");
        System.out.println(myAccount);
        myAccount.addFunds(150,"4893");
        System.out.println(myAccount);
        myAccount.addFunds(100,"4893");
        System.out.println(myAccount);
        myAccount.addFunds(500,"4983");
        System.out.println(myAccount);
        myAccount.addFunds(500,"4893");
        System.out.println(myAccount);

    }
}
