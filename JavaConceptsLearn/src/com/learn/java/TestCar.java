package com.learn.java;

public class TestCar {

	public static void main(String[] args) {

		BMWCar b1 = new BMWCar();
		b1.start(); // method overriding
		b1.stop();
		b1.refuel();
		b1.theftsafety();
		b1.engine();
		
		System.out.println("*****");
		
		Car b2 = new Car();
		b2.start();
		b2.stop();
		b2.refuel();
		b2.engine();
		
		System.out.println("*****");
		
		// Car is parent of BMWCar
		Car b3 = new BMWCar(); // TOP-cast allowed; compile time polymorphism 
		b3.start();
		b3.stop();
		b3.refuel();
		b3.engine();
		
		System.out.println("*****");
		
		Vehicle v1 = new Vehicle();
		v1.engine();
		
		System.out.println("*****");
		
		// Vehicle is parent of Car
		//Car v2 = (Car) new Vehicle(); // DOWN-cast not allowed; run-time polymorphism
		
		
	}

}
