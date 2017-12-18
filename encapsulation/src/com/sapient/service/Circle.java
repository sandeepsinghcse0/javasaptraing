package com.sapient.service;

public class Circle {
	
	private double redious;

	public Circle(double redious) {
		super();
		this.redious = redious;
	}
	
   public  double calcArea(){
		
		return Math.PI*redious*redious;
	}
	
	public  double calcPerimeter(){
		
		return 2*Math.PI*redious;
	}
	
	

}
