package lv.lu.training.lesson2.lesson5;


import java.util.Scanner;

public class BankAccountUser {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("23589", 100, 200, 180);
myAccount.topUp("1234",100d);
 myAccount.withdraw("1234", 150d);
        System.out.print(myAccount);
    }

}
