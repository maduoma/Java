package com.dodemy;
// Association is a common term used for both has-a and part-of relationship model, though it is not limited to the 2 r/ships, we are not worried about the lifetime dependency between the objects.
// The objects can exist differently or independently.
//OOP Association in Java: The child and parent objects have their own lifecycles and there's no owner.
class Vehicle {
    // Complete this implementation
    int id;
    String model;

    public Vehicle(int id, String model) {
        this.id = id;
        this.model = model;
    }

}

class Driver {
    // Complete this implementation
    String driverName;
    Vehicle vehicle;

    public Driver(String driverName, Vehicle vehicle) {
        this.driverName = driverName;
        this.vehicle = vehicle;
    }

}

class Main {

    public static void main(String[] args) {
        // Write your code here
        Vehicle vehicle = new Vehicle(4453, "Volvo");
        {
            Driver  driver = new Driver("john", vehicle);
            System.out.println(driver.driverName +
                    " is the owner of car Id: " + driver.vehicle.id);
        }
        System.out.println();
        System.out.println("Vehicle exists outside Driver block ie {}");
        System.out.println("This is to show that Vehicle exists on its own with Driver!");
        System.out.println("Vehicle Id: " +vehicle.id);
        System.out.println("Vehicle model: " +vehicle.model);
    }

}