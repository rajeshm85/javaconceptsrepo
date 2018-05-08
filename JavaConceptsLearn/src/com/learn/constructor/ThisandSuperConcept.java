package com.learn.constructor;

public class ThisandSuperConcept {

	
	// no return type for constructor
	public ThisandSuperConcept() {
		// TODO Auto-generated constructor stub
		System.out.println("default constructor");
	}
	
	public ThisandSuperConcept(int a) {
		System.out.println("with 1 param");
		System.out.println("Value of a: " +a);
	}
	
	public ThisandSuperConcept(int b, int c) {
		System.out.println("with 2 params");
		System.out.println("Value of a: " +b);
		System.out.println("Value of a: " +c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisandSuperConcept t2 = new ThisandSuperConcept(2, 2);
		System.out.println("***");
		ThisandSuperConcept t = new ThisandSuperConcept();
		System.out.println("***");
		ThisandSuperConcept t1 = new ThisandSuperConcept(1);
		System.out.println("***");
	}

}
