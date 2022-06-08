package lv.lu.training.homework4;

import java.util.Scanner;
//LABOT
//Pārbaudīt loģiku, ja ievada 3,3,2 lielākais būs 2 un pārbaudīt, kā pieraksta loģisko 'AND' operatoru nevis bitwise 'AND'
//Izlabots, lūdzu pārbaudīt  - loģisko 'AND' operatoru pieraksta ar && un, lai strādātu koda loģika operatoram jābūt >= nevis tikai >.
public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println(firstNumber + " sis skaitlis ir lielakais!");
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            System.out.println(secondNumber + " sis skaitlis ir lielakais!");
        } else {
            System.out.println(thirdNumber + " sis skaitlis ir lielakais!");
        }
    }
}
