package com.sapient.service;

public class Mobile extends Product {

	private String camera;

	public Mobile(int prodid, String prodName, double price, String camera) {
		super(prodid, prodName, price);
		this.camera = camera;
	}

	@Override
	public String isExpensive() {
		// TODO Auto-generated method stub
		double price = getPrice();
		if (price >= 10000)
			return "Expensive";
		else if (price > 5000)
			return "Average";
		else
			return "Cheap";
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.printf("%20s%20s%20s\n", camera, isExpensive(), getClass().getSimpleName());
	}

}