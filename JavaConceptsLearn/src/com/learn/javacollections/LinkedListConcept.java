package com.learn.javacollections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("raj");
		ll.add("aks");
		
		// print all
		System.out.println("Value: " +ll+ ", Size: " +ll.size());
		
		// add first and last
		ll.addFirst("test");
		ll.addLast("etl");
		System.out.println("Value: " +ll+ ", Size: " +ll.size());

		// remove frst node
		ll.remove();
		System.out.println("Value: " +ll+ ", Size: " +ll.size());
		
		// remove last node
		ll.removeLast();
		System.out.println("Value: " +ll+ ", Size: " +ll.size());
		
		// set
		ll.set(1, "esh");
		System.out.println("Value: " +ll+ ", Size: " +ll.size());
		
//		// clear
//		ll.clear();
//		System.out.println("Value: " +ll+ ", Size: " +ll.size());
		
		// iterate
		
		for(String s:ll) {
			System.out.println("Value: " +s);
		}
		
		Iterator <String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println("Value: " +it.next());
		}
		
	}
}