package com.sapient.lambda;

public class CalcClient {
	
	
	/*
	 * demo-multiple inline multiplication 
	 * @param args
	 */

	public static void main(String[] args) {

		ICalculator add=(a,b)->{return a+b;};
		ICalculator sub=(int a,int b)->{return a-b;};
		ICalculator mul=(a,b)-> a*b;
		
		System.out.println(add.doCal(10, 20));
		System.out.println(sub.doCal(10, 20));
		System.out.println(mul.doCal(10, 20));

	}

}
