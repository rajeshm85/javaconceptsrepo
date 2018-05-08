package com.learn.java;

public class ClassnObject implements Cloneable {

	int model;
	int wheels;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		
		ClassnObject a = new ClassnObject();
		
		a.model=2000;
		a.wheels=4;
		
		System.out.println(a.model +" "+a.wheels);
				
		ClassnObject b = a;
		b.model=2014;
		b.wheels=6;
		System.out.println(b.model +" "+b.wheels);
		System.out.println(a.model +" "+a.wheels);

		ClassnObject c = (ClassnObject) b.clone();
		System.out.println(c.model +" "+c.wheels);
		c.model=1990;
		c.wheels=5;
		System.out.println(c.model +" "+c.wheels);
		
		System.out.println(b.model +" "+b.wheels);
		System.out.println(a.model +" "+a.wheels);
		
		System.out.println("******");
	}

}
