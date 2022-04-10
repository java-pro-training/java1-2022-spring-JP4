package lv.lu.training.lesson2;

public class HelloWorld {
    public static void main(String[] args) {
        String part1 = "Hello";
        String part2 = "World";
        String result = part1 + "" + part2;
        System.out.println(result);
        int side1 = 10;
        int side2 = 15;
        int side3 = 14;
        int side4 = 25;
        result = result + side2;
        result += side3; // infix operācija
        result += side4;
        System.out.println("perimetrs" + result);
    }

    public class TriangleAreaCalculator {
        public static void main(String[] args) {
            int base = 10;
            int height = 20;
            String result = "(10 * 20)/2";
            System.out.println(result);


        }

    }
}
