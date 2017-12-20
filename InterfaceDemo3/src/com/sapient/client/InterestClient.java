package com.sapient.client;

import com.sapient.service.Calculator;
import com.sapient.service.Interest;

public class InterestClient {

	public static void main(String args[])
	{
		Interest obj=Calculator.getInterest();
		System.out.println("Simple Interest::"+obj.calcSimple(10000, 2, 10));
		System.out.println("Compound Interest::"+obj.calcCompound(10000, 2, 10));
	}
}
