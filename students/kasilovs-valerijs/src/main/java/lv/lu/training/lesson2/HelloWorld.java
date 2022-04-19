package lv.lu.training.lesson2;

//LABOT
//Izveido HelloWorld klasi atsevišķi.
//Izveido TriangleAreaCalculator klasi atsevišķi.
// Mums java projekts ir ar java 8 - iekšējās klases ar static netiek atbalstīta.
public class HelloWorld {
    public static void main(String[] args) {
        String part1 = "Hello";
        String part2 = "World";
        String result = part1 + "" + part2; //šim uzdevumam izveidot atsevišķu klasi
        System.out.println(result);
        int side1 = 10;                     //aprēķinos neizmanto šo mainīgo?
        int side2 = 15;
        int side3 = 14;
        int side4 = 25;
        result = result + side2;            //šajā rindā result ir "HelloWorld"...
        result += side3; // infix operācija
        result += side4;
        System.out.println("perimetrs" + result);
    }

    public class TriangleAreaCalculator {   //šim uzdevumam izveidot atsevišķu klasi
        public static void main(String[] args) {
            int base = 10;                  //nodefinēts mainīgais, bet aprēķinos neizmanto
            int height = 20;                 //nodefinēts mainīgais, bet aprēķinos neizmanto
            String result = "(10 * 20)/2";
            System.out.println(result);


        }

    }
}
