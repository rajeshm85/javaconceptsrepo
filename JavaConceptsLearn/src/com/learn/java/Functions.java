package com.learn.java;

public class Functions {
	
	int a=0;
	String b="global";

	public static void main(String[] args) {
		
		Functions f = new Functions();
		System.out.println("Inside main");
		System.out.println(f.a +" "+ f.b);
		
		f.test1();
		f.test2();
		
		System.out.println("Inside main");
		System.out.println(f.a +" "+ f.b);
	}
	
	
	public void test1() {
		System.out.println("Inside test1");
		int a=1;
		String b="test1";
		System.out.println(a+" "+b);
	}
	
	public void test2() {
		System.out.println("Inside test2");
		a=2;
		b="test2";
		System.out.println(a+" "+b);
	}
}
