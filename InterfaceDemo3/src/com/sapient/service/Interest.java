package com.sapient.service;

public interface Interest extends Basic {
	
	double calcSimple(double amt,int year,float rate);
	double calcCompound(double amt,int year,float rate);

}
