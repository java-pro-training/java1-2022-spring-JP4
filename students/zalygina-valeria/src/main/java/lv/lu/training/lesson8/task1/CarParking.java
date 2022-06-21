package lv.lu.training.lesson8.task1;

import lv.lu.training.lesson8.Buss;

import java.util.Arrays;
import java.util.List;

//LABOT
//kods nedarbojas
public class CarParking {
    public class CarParking {
        public static void maid(String[] args) {

            Bus myNewBus = new Bus("Black", 2020, "Mercedes", 50);
            Bus myOldBus = new Bus("Yellow", 1995, "Man", 35);
            Truck myTruck = new Car("Blue", 2022, "BMW");

            List<Car> allMyVahicles = Arrays.asList(myNewBus, myOldBus, myTruck, myCar);
            for (Car car: allMyVahicles) {
                System.out.println(car);
            }
        }
    }
}
