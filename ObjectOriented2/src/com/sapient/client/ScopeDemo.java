package com.sapient.client;

public class ScopeDemo {
	
	// Initialize the constant;
	public static final int MAX;
	static{
		System.out.println("Static block");	
		 MAX=10;
	}
	
	public static void main(String args[])
	{
		 System.out.println("I am in m main");
		
	}

}
