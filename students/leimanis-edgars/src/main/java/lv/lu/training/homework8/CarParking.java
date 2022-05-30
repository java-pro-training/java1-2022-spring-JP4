package lv.lu.training.homework8;

public class CarParking {
    public static void main(String[] args) {
        Bus myNewBus = new Bus ("Red", 2020, "Volvo", 50);
        Bus myOldBus = new Bus ("Yellow", 1990, "Man", 15);
        Truck myTruck = new Truck("black", 2010, "Man", 3000);
        Car myCar = new Car("Green", 2021, "BMW");


        System.out.println("myNewBus: "  +myNewBus);
        System.out.println("myOldBus: "  +myNewBus);
        System.out.println("Are busses equals: "  +myNewBus.equals(myOldBus));
        System.out.println("Truck: "  +myTruck);
        System.out.println("Car: "  +myCar);

        }
    }

