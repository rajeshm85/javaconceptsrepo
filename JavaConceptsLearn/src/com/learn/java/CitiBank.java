package com.learn.java;

public class CitiBank implements USBanking, UKBanking { // multiple inheritance
// is a relationship
	
	@Override
	public void followUKRegulations() {
		// TODO Auto-generated method stub
		System.out.println("following UK banking regulations");

	}

	@Override
	public void followUSRegulations() {
		// TODO Auto-generated method stub
		System.out.println("following US banking regulations");
	}

	@Override
	public void allowOnlineBanking() {
		// TODO Auto-generated method stub
		System.out.println("implementing online banking");
	}

	@Override
	public void allowGeneralBanking() {
		// TODO Auto-generated method stub
		System.out.println("implementing general banking");
	}
	
	public void provideLoans() {
		System.out.println("citi bank provides loan");
	}

}
