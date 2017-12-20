package com.sapient.service;

public interface Basic {
	
	String convert2Binary(int num);
	
	public default int doSum(int ...a){
		int sum=0;
		for(int arr:a){
			sum=sum+arr;
		}
		return sum;
	}
	
	public default double doAvg(int ...a){
		int sum=doSum(a);
		double avg=(double)sum/a.length;
		return avg;
	}

}
