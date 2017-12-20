package com.sapient.service;

import java.math.BigInteger;

public class Calculator implements Interest, Findfact {

	private static Calculator cal = new Calculator();

	private Calculator() {

	}

	public static Interest getInterest() {
		Interest intr = cal;
		return intr;
	}
	
	
	public static Findfact getFindFact() {
        Findfact fact = cal;
		return fact;
	}

	@Override
	public String convert2Binary(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double calcSimple(double amt, int year, float rate) {
		// TODO Auto-generated method stub
		double si = amt * year * rate / 100.0;
		return si;
	}

	@Override
	public double calcCompound(double amt, int year, float rate) {
		// TODO Auto-generated method stub
		double ci = amt * Math.pow((1 + rate / 100), 2);
		return ci-amt;
	}

	@Override
	public BigInteger findFact(int num) {
		// TODO Auto-generated method stub
		BigInteger fact = BigInteger.ONE;
		for (int i = 1; i <= num; i++) {
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}

}
