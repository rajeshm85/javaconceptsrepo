package com.learn.javacollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListLearn {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee("raj", 33, "QA");
		Employee e2 = new Employee("aks", 28, "ETL");
		Employee e3 = new Employee("Harry", 10, "ops");

		ArrayList <Employee> ar1 = new ArrayList<Employee>();
		
		ar1.add(e1);
		System.out.println("****One employee****");
		System.out.println("Size of ArrayList: " +ar1.size());
		System.out.println("Employee 1: Name=" +ar1.get(0).name+ ", Age: " +ar1.get(0).age+ ", Dept: " +ar1.get(0).dept);
		
		ar1.add(e2);
		ar1.add(e3);
		System.out.println("****Added another employee****");
		System.out.println("Size of ArrayList: " +ar1.size());
		for (int i = 0; i < ar1.size(); i++) {
			System.out.println("Employee "+i+"==> Name=" +ar1.get(i).name+ ", Age: " +ar1.get(i).age+ ", Dept: " +ar1.get(i).dept);
		}

		ar1.remove(e1);
		System.out.println("****Removed first employee****");
		System.out.println("Size of ArrayList: " +ar1.size());

		Iterator<Employee> ite = ar1.iterator();
		
		while(ite.hasNext())
		{
			Employee emp = ite.next();
			System.out.println("Employee ==> Name=" +emp.name.toUpperCase()+ ", Age: " +emp.age+ ", Dept: " +emp.dept);
		}
		
		Employee e4 = new Employee("Tom", 12, "test");
		Employee e5 = new Employee("Harry", 10, "ops");
		Employee e6 = new Employee("Harry", 10, "ops");
		
		ArrayList<Employee> ar2 = new ArrayList<Employee>();
		ar2.add(e4);
		ar2.add(e5);
		ar2.add(e6);
		
		System.out.println("****Before AddAll****");
		System.out.println("Size of ArrayList: " +ar1.size());

		Iterator<Employee> ite2 = ar1.iterator();
		
		while(ite2.hasNext())
		{
			Employee emp = ite2.next();
			System.out.println("Employee ==> Name=" +emp.name.toUpperCase()+ ", Age: " +emp.age+ ", Dept: " +emp.dept);
		}
		
		ar1.addAll(ar2);
		
		System.out.println("****After AddAll****");
		System.out.println("Size of ArrayList: " +ar1.size());

		Iterator<Employee> ite3 = ar1.iterator();
		
		while(ite3.hasNext())
		{
			Employee emp = ite3.next();
			System.out.println("Employee ==> Name=" +emp.name.toUpperCase()+ ", Age: " +emp.age+ ", Dept: " +emp.dept);
		}
		
		
		ar1.removeAll(ar2);
		
		System.out.println("****After RemoveAll of ar2 lists****");
		System.out.println("Size of ArrayList: " +ar1.size());

		Iterator<Employee> ite4 = ar1.iterator();
		
		while(ite4.hasNext())
		{
			Employee emp = ite4.next();
			System.out.println("Employee ==> Name=" +emp.name.toUpperCase()+ ", Age: " +emp.age+ ", Dept: " +emp.dept);
		}
		
		
//		ar1.retainAll(ar2);
//		System.out.println("****Retain all for common employees****");
//		System.out.println("Size of ArrayList: " +ar2.size());
//
//		Iterator<Employee> ite6 = ar1.iterator();
//		
//		while(ite6.hasNext())
//		{
//			Employee emp = ite6.next();
//			System.out.println("Employee ==> Name=" +emp.name.toUpperCase()+ ", Age: " +emp.age+ ", Dept: " +emp.dept);
//		}
	}

}