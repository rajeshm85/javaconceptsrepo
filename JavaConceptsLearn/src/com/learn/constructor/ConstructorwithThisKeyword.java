package com.learn.constructor;

public class ConstructorwithThisKeyword {

	String name;
	int age;
	
	public ConstructorwithThisKeyword(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
		System.out.println("****Local variable value****");
		System.out.println("Name: " +name+ " Age: " +age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorwithThisKeyword c = new ConstructorwithThisKeyword("raj", 33);
		System.out.println("****lobal variable value****");
		System.out.println("Name: " +c.name+ " Age: " +c.age);
		
		c.name="aks";
		c.age=28;
		System.out.println("****Update local variable value****");
		System.out.println("Name: " +c.name+ " Age: " +c.age);
	}

}