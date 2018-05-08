package com.learn.java;

public class StaticvsNonStatic {

	
	public String name = "rajesh";
	public static int age = 33;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticvsNonStatic obj = new StaticvsNonStatic();
		obj.getName();
		
		System.out.println(age);
		getAge();
		
		StaticvsNonStatic.getAge();
		System.out.println(age);
	}
	
	
	public void getName() {
		System.out.println("Name is: " +name);
	}

	public static void getAge() {
		age = 22;
		System.out.println("Age is: " +age);
	}
}
