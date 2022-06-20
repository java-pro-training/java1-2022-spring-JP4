package lv.lu.training.homework8.car;

import java.util.Arrays;
import java.util.List;
//IESK
public class CarParking {
    public static void main(String[] args) {

        Buss myNewBuss = new Buss("Black", 2020, "Mercedes", 50);
        Buss myOldBuss = new Buss("Yellow", 1995, "Man", 35);
        Truck myTruck = new Truck("White", 2015, "Volvo", 2500);
        Car myCar = new Car("Blue", 2022, "BMW");

        List<Car> allMyVenicles = Arrays.asList(myNewBuss, myOldBuss, myTruck, myCar);
        for (Car car : allMyVenicles) {
            System.out.println(car);


            // System.out.println("My new buss: " + myNewBuss);
            // System.out.println("My old buss: " + myOldBuss);
            //  System.out.println("Are busses equals: " + myNewBuss.equals(myOldBuss));
        }
    }
}
