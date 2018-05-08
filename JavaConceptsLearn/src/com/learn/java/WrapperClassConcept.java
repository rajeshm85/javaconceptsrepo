package com.learn.java;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "100";
		
		System.out.println("Non-Parsed: " +(a+200));
		System.out.println("Parsed to Integer: "+ (Integer.parseInt(a)+200));
		
		String b = "5";
		System.out.println("Parsed to Double: "+ (Double.parseDouble(b)+10));

		System.out.println("Value of a after parse: " +a);
		System.out.println("Value of b after parse: " +b);
		
		String x = "test";
		System.out.println("Non-Parsed: " +x);
		System.out.println("Parsed String to Boolean: " +(Boolean.parseBoolean(x)));
		
		int y = 2;
		System.out.println("Non-Parsed: " +y);
		System.out.println("Non-Parsed and add 5: " +(y+5));
		System.out.println("Parsed Integer to String: " +(String.valueOf(y)));
		System.out.println("Parsed Integer to String and add 5: " +(String.valueOf(y)+5));

	}

}
