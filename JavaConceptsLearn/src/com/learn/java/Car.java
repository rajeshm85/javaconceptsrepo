package com.learn.java;

public class Car extends Vehicle {
// has a relationship
	
	public void start() {
		System.out.println("Car started");
	}
	
	public void stop() {
		System.out.println("Car stopped");
	}

	public void refuel() {
		System.out.println("Car refuelled");
	}
}
