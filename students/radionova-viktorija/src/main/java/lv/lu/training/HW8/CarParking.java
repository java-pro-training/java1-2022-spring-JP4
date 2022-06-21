package lv.lu.training.HW8;

import java.util.Arrays;
import java.util.List;

public class CarParking {
    public static void main(String[] args) {

        Buss myNewBuss = new Buss("Red", 2017, "Volvo", 45);
        Buss myOldBuss = new Buss("Yellow", 1995, "Mercedes", 45);
        Truck myTruck = new Truck("White", 2018, "Volvo", 2500);
        Car myCar = new Car("Black", 2022, "Nissan");

        List<Car> allMyVenicles = Arrays.asList(myNewBuss, myOldBuss, myTruck, myCar);
        for (Car car : allMyVenicles) {
            System.out.println(car);


            // System.out.println("My new buss: " + myNewBuss);
            // System.out.println("My old buss: " + myOldBuss);
            //  System.out.println("Are busses equals: " + myNewBuss.equals(myOldBuss));
        }
    }
}