package com.learn.java;

public interface USBanking {

	int min_balance = 100; // static by default and this is final in nature
	
	public void followUSRegulations(); // should be non-static
	public void allowOnlineBanking();
	public void allowGeneralBanking();
}
