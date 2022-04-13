package lv.lu.training.lesson2;

public class HomeWork2pt2 {
    public static void main(String[] args) {
        // Vienmēr deklarējiet tipu un tad nosaukumu

        int side1 = 5;

        int side2 = 4;

        int side3 = 6;

        int side4 = 14;

        int result = side1; // deklarēšana un piešķiršana
        result = result + side2;
        result += side3; // infix operācija
        result += side4;
        System.out.println("perimetrs: " + result);
    }
}
