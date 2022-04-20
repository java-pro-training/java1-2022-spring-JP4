package lv.lu.training.lesson2;

//IESK
public class HomeWorkPerimeter2 {
//    Vienmer deklarejiet tipu un tad nosaukumu

        public static void main(String[] args) {
            int side1 = 10;
            int side2 = 15;
            int side3 = 14;
            int side4 = 25;
            int result = side1; /*deklarešana un piešķiršana*/
            result = result + side2;
            result += side3;
            result += side4;
            System.out.println("perimetrs: " + result);
        }
    }
