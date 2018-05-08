package com.learn.java;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTablenHashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable h = new Hashtable();
		
		h.put("A", "What");
		h.put("B", "is");
		h.put("C", "your");
		h.put("D", "name?");
		
		h.put(1, 100);
		h.put(2, 200);
		
		System.out.println("***** By key *****");
		System.out.println(h.get("A"));
		
		h.put(3, "String");
		System.out.println(h.get(3));
		
		System.out.println("***** All keys *****"); // Will not be sorted by HashTable
		System.out.println("Size of HashTable: " +h.size());
		System.out.println("Print HashTable - Key/Value pair of h: " +h);
		Enumeration e = h.keys();
		Enumeration ev = h.elements();
		while(e.hasMoreElements()) {
			System.out.println("Key: " +e.nextElement()+ ", Value: " +ev.nextElement());
		}
		
		System.out.println("***** HashMap *****"); // Will be sorted by HashMap
		HashMap hm = new HashMap();
		hm.put("C", "your");
		hm.put("B", "is");
		hm.put("A", "what");
		hm.put("D", "name?");
		
		System.out.println("Value of HashMap: " +hm);
		for(Object s: hm.keySet()) {
			System.out.println("Key: " +s+ ", Value: " +hm.get(s));
		}
		
		System.out.println("***** After removal ***** "); // after removal of 1 key;
		
		hm.remove("B");
		System.out.println("Value of HashMap: " +hm);
		for(Object s: hm.keySet()) {
			System.out.println("Key: " +s+ ", Value: " +hm.get(s));
		}
	}

}
