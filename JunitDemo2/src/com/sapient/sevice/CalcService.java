package com.sapient.sevice;

public class CalcService {
	
	public double calcServices(int a,int b,int c) {
		double res=(a+b+c)/2.0;
		return res;
	}
	
	public double round2N(double num,int n) {
		int mult=(int)Math.pow(10, n);
		return ((int)(num*mult)/(double)(mult));
	}

}
