package com.sapient.services;

public class Interest {
	
	public double amt;
	public int years;
	public float rate;

	
public double calcSimple(){
		   double si=amt*rate*years/100;
		   return si;
	   }

public double clacCompound(){
	   double ci= amt*Math.pow(1+rate/100,years);
	   return ci;
}

}
