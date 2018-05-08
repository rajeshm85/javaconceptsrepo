package com.learn.java;

public class Arrayconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[];
		String a1[];
//		String a2[][] = new String[8][2]; // row=8 col=2
		
		String a2[][] = { {"raj", "aks"} };
		
//		System.out.println(a.length);
//		System.out.println(a1.length);
		System.out.println(a2.length); // row
		System.out.println(a2[0].length); // col
		
//		for(int i=0;i<a2.length && a2!=null;i++) { // row
//			for(int j=0;j<a2[i].length && a2[i][j]!=null;j++) // col
//				System.out.println(a2[i][j].toString());
//		}
		
		for(String s1[]:a2)
			for(String s2: s1)
				if(s2!=null)
					System.out.println(s2);
	}

}