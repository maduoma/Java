package com.dodemy;
//Association in Java - generic term for Has-A & Part-Of relationship model: The child and parent objects have their own lifecycles and there's no owner.
class Vehicle {
    // Complete this implementation
    int id;
    String model;

    public Vehicle(int id, String model){
        this.id = id;
        this.model = model;
    }
}

class Driver {
    // Complete this implementation
    String driverName;
    Vehicle vehicle;
    public Driver(String driverName, Vehicle vehicle){
        this.driverName = driverName;
        this.vehicle = vehicle;
    }

}

class Main {

    public static void main(String[] args) {
        // Write your code here
        Vehicle vehicle = new Vehicle(4453, "Volvo S60");
        {
            Driver driver = new Driver("John", vehicle);
            System.out.println(driver.driverName +
                    " is a driver of car Id: " +driver.vehicle.id);
        }
        System.out.println();
        System.out.println("Below is to show that the vehicle has its own life " +
                "outside the car!");
        System.out.println(vehicle.model);
        System.out.println(vehicle.id);
    }

}