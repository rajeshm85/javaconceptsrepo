package com.learn.constructor;

public class B extends A{

	public B() { // Parent constructor will be called first and then child's
		// TODO Auto-generated constructor stub
		super(10, 20); // calls the custom constructor and doesn't call the default; If super is not mentioned, only default will be called.
		// super should be writted ONLY in the child classes' constructor
		// super should be the first statement
		System.out.println("Child class: Constructor of B");
	}
	
	public static void main(String[] args) {
		B obj = new B();
	}

}