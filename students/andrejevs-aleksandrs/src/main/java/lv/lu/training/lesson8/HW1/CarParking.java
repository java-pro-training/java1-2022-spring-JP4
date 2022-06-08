package lv.lu.training.lesson8.HW1;

import java.util.Arrays;
import java.util.List;

public class CarParking {
    public static void main(String[] args) {
        Bus myNewBus = new Bus("Red", 2020, "Volvo", 50);
        Bus myOldBus = new Bus("Yellow", 1990, "Man", 15);
        Truck myTruck = new Truck("Black", 2010, "Man", 3000);
        Car myCar = new Car("Green", 2021, "BMW");
        List<Car> allMyVehicles = Arrays.asList(myNewBus, myOldBus, myTruck, myCar);
        for (Car car : allMyVehicles) {
            System.out.println(car);
        }
    }
}
