package lv.lu.training.lesson10.HW2;

import java.util.Scanner;
//IESK
public class UserCreator {
    public static void main(String[] args) {
        System.out.println("Please enter your name:");
        String name = NameValidator.validateName();
        System.out.println("Please enter your surname:");
        String surname = SurnameValidator.validateSurname();
        System.out.println("Please enter your age:");
        int age = AgeValidator.validateAge();
        System.out.println("User confirmed!");
        System.out.println(new User(name, surname, age));
    }
}
