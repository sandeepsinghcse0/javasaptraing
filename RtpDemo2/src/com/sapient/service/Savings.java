package com.sapient.service;

public class Savings extends Account {

	public Savings(int accId, String custName, double bal) {
		super(accId, custName, bal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String deposit(double amt) {
		double bal =getBal();
		
		String res="not deposit";
		
		
		if(bal>50000){
			setBal(bal+amt);
			res="deposited";
		}
		return null;
	}


}
