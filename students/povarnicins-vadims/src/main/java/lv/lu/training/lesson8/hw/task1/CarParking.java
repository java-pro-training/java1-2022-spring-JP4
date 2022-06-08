package lv.lu.training.lesson8.hw.task1;

import java.util.Arrays;
import java.util.List;

public class CarParking {

    public static void main(String[] args) {

        Buss myNewBuss = new Buss("Red", 2020, "Volvo", 50);
        Buss myOldBuss = new Buss("Yellow", 1990, "MAN", 15);

        Truck myTruck = new Truck("black", 2010, "MAN", 3000);
        Car myCar = new Car("green", 2021, "BMW");

        List<Car> allMyVehicles = Arrays.asList(myNewBuss, myOldBuss, myTruck, myCar);
        for (
                Car car : allMyVehicles) {
            System.out.println(car);
        }
    }

}

