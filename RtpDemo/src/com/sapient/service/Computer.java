package com.sapient.service;

public class Computer extends Product {
	
	private String hdd;

	public Computer(int prodid, String prodName, double price, String hdd) {
		super(prodid, prodName, price);
		this.hdd = hdd;
	}

	@Override
	public String isExpensive() {
		// TODO Auto-generated method stub
		double price=getPrice();
		if(price>=50000)
			return "Expensive";
		else if(price>30000)
			  return "Average";
		else
			  return "Cheap";
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.printf("%10s%30s%20s\n", hdd, isExpensive(), getClass().getSimpleName());
	}
	
	
	

}
