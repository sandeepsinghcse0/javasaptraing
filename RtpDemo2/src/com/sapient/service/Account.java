package com.sapient.service;

public abstract class Account {
	private int accId;
	private String custName;
	private double bal;
	

	public Account(int accId, String custName, double bal) {
		super();
		this.accId = accId;
		this.custName = custName;
		this.bal = bal;
	}

	
  public void display(){
	  System.out.println("----------------------------------------------");
	  System.out.println("AccID:"+accId);
	  System.out.println("Customer name:"+custName);
	  System.out.println("bal:"+bal);
  }


public double getBal() {
	return bal;
}




public int getAccId() {
	return accId;
}


public void setBal(double bal) {
	this.bal = bal;
}




public String getCustName() {
	return custName;
}


public abstract String deposit(double bal);
  
  
}
