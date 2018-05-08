package com.learn.java;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListconcept {

	public static void main(String[] args)
	{
		
		ArrayList ar = new ArrayList();
		ar.add("roger");
		ar.add(5);
		
		System.out.println("***** Initial values of Arraylist *****");
		System.out.println("Total array objects in ar is: " +ar.size());
		for(Object a: ar)
			System.out.println("Index: " +ar.indexOf(a)+ ", Value: " +ar.get(ar.indexOf(a)));
		
//		Iterator it = ar.iterator();
//		while(it.hasNext())
//		{
//			Object o = it.next();
//			System.out.println("Values: " +o);
//		}
		
		ar.add("Tom");
		
		System.out.println("***** After Addition of Tom *****");
		System.out.println("Total array objects in ar is: " +ar.size());
		for(Object a: ar)
			System.out.println("Index: " +ar.indexOf(a)+ ", Value: " +ar.get(ar.indexOf(a)));
				
//		ar.set(5, "Raj"); // cannot go beyond size
		
		System.out.println("***** After Removal of one element *****");

		ar.remove(1); // removal of value 5 in arrayindex; is casesensitive
		
		System.out.println("Total array objects in ar is: " +ar.size());
		for(Object a: ar)
			System.out.println("Index: " +ar.indexOf(a)+ ", Value: " +ar.get(ar.indexOf(a)));
		
		
		System.out.println("***** Accept only Integer *****");
		
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		ar2.add(5);
		ar2.add(3);
//		ar2.add("Tom"); // cannot add as ar2 is only accepting integer values;
		
		System.out.println("Total array objects in ar2 is: " +ar2.size());
		Iterator it2 = ar2.iterator();
		while(it2.hasNext())
		{
			Object o2 = it2.next();
			System.out.println("Values: " +o2);
		}
		
		System.out.println(ar2.contains(5));
	}
}
