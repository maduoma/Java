package com.dodemy;

public class Main {

    public static void main(String[] args) {
	    Car car = new Car();
	    Car.Volvo volvo = car.new Volvo();
        System.out.println(volvo.volvoColor);
    }
}
