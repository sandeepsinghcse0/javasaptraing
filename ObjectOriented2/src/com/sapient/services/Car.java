package com.sapient.services;

public class Car {
	private int carId;
    private String carName;
    private double price;
    
	public Car(int carId) throws Exception {
		super();
		if(carId<1000)
			throw new Exception("carId must be greater than 1000");
		this.carId = carId;
	}
	
	public Car(int carId,String carName) throws Exception {
		this(carId);
		System.out.println("two argument constructer ");
		if(carName.matches("[a-z]{3,10}"))
			throw new Exception("carName musthave alphbet three or more than three alphabet");
		this.carName=carName;
	}
	
	public Car(int carId,String carName,double price) throws Exception {
		this(carId,carName);
		
		System.out.println("two argument constructer ");
		
		if(price<100000)
			throw new Exception("car price must be greater than 100000");
		this.price=price;
	}
	
	
	public void dispaly(){
		System.out.println("Car id is"+carId);
		System.out.println("Car name is"+carName);
		System.out.println("Car price is"+price);
	}
}
