package com.learn.java;

public class CallbyvaluevsCallbyreference {

	int p = 2;
	int q = 8;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CallbyvaluevsCallbyreference obj = new CallbyvaluevsCallbyreference();
		int x = 10;
		int y = 20;
		System.out.println("Call by value: " +obj.test(x,y));
		
		obj.p=90;
		obj.q=4;
		
		System.out.println("Before swap: P is " +obj.p+ ", Q is " +obj.q);
		obj.swap(obj);
		System.out.println("Before swap: P is " +obj.p+ ", Q is " +obj.q);
		
	}

	
	public int test(int a, int b) {
		a=20;
		b=40;
		
		int c = a+b;
		return c;
	}
	
	
	public void swap(CallbyvaluevsCallbyreference r) {
		int temp;
		temp = r.p;
		r.p = r.q;
		r.q = temp;
	}
}