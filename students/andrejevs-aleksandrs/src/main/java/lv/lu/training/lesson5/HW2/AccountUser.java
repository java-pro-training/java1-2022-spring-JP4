package lv.lu.training.lesson5.HW2;

import java.util.Scanner;

public class AccountUser {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("LV56PARX0030246807863", "4893", 150d, 300d, 0d);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mans konts " + myAccount);
        myAccount.withDraw(350d,"4894");
        System.out.println(myAccount);
        myAccount.withDraw(350d,"4893");
        System.out.println(myAccount);
        myAccount.withDraw(350d,"4893");
        System.out.println(myAccount);
        myAccount.addFunds(150d,"4893");
        System.out.println(myAccount);
        myAccount.addFunds(100d,"4893");
        System.out.println(myAccount);
        myAccount.addFunds(500d,"4983");
        System.out.println(myAccount);
        myAccount.addFunds(500d,"4893");
        System.out.println(myAccount);

    }
}
