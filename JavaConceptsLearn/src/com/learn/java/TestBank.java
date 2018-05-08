package com.learn.java;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		USBanking usbank = new USBanking(); // interface object creation is not allowed
		
			CitiBank c1 = new CitiBank(); // complie time polymorphism
			
			c1.allowGeneralBanking();
			c1.allowOnlineBanking();
			c1.followUSRegulations();
			c1.followUKRegulations();
			c1.provideLoans();
			System.out.println("Minimum balance in USBank branch: " +USBanking.min_balance);
			System.out.println("Minimum balance in UKBank branch: " +UKBanking.min_balance);


			System.out.println("*****");
			
			USBanking c2 = new CitiBank(); // run-time polymorphism

			c2.allowGeneralBanking();
			c2.followUSRegulations();
			c2.allowOnlineBanking();
			
//			c2.provideLoans(); // not allowed accessed from the child class object referred by parent class
			
	}

}
