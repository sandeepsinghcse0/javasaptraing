package com.sapient.sevice;

public class Factory {
	
	public static CalcService getCalcService() {
		CalcService ser =new CalcService();		
		return ser;		
	}
	
	
	public static Palindrome getPalindromeService() {
		Palindrome ser =new Palindrome();		
		return ser;		
	}
	
	
	public static EmpService getEmpService() {
		EmpService ser =new EmpService();		
		return ser;		
	}
	
	
	
public static String[] input() {
		return new String[]{"hanuman","ram","lakshman","shatrudan","bharat","ravan"};
	}
	
}
