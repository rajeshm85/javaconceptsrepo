package com.learn.javacollections;

public class SingletonConcept {

	// Singleton class is a class that can have only 1 object
	// Design of the singleton class:
	// 1. Make constructor as private
	// 2. Write a static method which has return type object of this Singleton class
	// (called as lazy initialization)

	private static SingletonConcept sc = null;
	private String str = null;

	
	private SingletonConcept(){
		str = "Test string in singleton class";
	}

	// this is test
	public static SingletonConcept getInstance() {
		if (sc == null)
			sc = new SingletonConcept();

		return sc;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingletonConcept a1 = SingletonConcept.getInstance();
		SingletonConcept a2 = SingletonConcept.getInstance();
		SingletonConcept a3 = SingletonConcept.getInstance();

		a1.str = a1.str.toUpperCase().concat(" - Rajesh");
		System.out.println("A1 str: " + a1.str);
		System.out.println("A2 str: " + a2.str);
		System.out.println("A3 str: " + a3.str);

		a3.str = "replaced from a3";
		System.out.println("A1 str: " + a1.str);
		System.out.println("A2 str: " + a2.str);
		System.out.println("A3 str: " + a3.str);
	}

}
