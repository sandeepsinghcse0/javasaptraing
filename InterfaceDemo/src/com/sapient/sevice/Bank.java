package com.sapient.sevice;

public class Bank implements Agent,Atm {
	
	private static Bank bank=new Bank();
	
	private Bank(){
		
	}
	
	
	public static Atm getAtm(){
		Atm atm=bank;
		return atm;
	}
	
	public static Agent getAgent(){
		Agent agent=bank;
		return agent;
	}

	@Override
	public void withdraw() {
		System.out.println("withdraw");
		
	}

	@Override
	public void deposit() {
		System.out.println("deposit");
		
	}

	@Override
	public void getBal() {
		System.out.println("getBal");
		
	}

	@Override
	public void clearPdc() {
		System.out.println("clearPdc");
		
	}

	@Override
	public void approveLoan() {
		System.out.println("approveLoan");
		
	}

}
