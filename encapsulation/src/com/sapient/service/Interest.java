package com.sapient.service;

public class Interest {
	
	private double amt;
	private int years;
	private float rate;

	
public double calcSimple(){
		   double si=amt*rate*years;
		   return si;
	   }

public double clacCompound(){
	   double ci= amt*Math.pow(1+rate,years);
	   return ci;
}

public double getAmt() {
	return amt;
}

public void setAmt(double amt) throws Exception {
	if(amt<5000)
		throw new Exception("Amount must be greater than 5000 or equal");
	this.amt = amt;
}

public int getYears() {
	return years;
}

public void setYears(int years) {
	this.years = years;
}

public float getRate() {
	return rate;
}

public void setRate(float rate) throws Exception {
	if(rate>0 && rate<=1)
		throw new Exception("Amount must be between 0 and 1");
	this.rate = rate;
}

}