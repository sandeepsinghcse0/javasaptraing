package com.sapient.exceptions;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("Line 1");
		System.out.println("Line 2");
		try {
			int a = 5 / 1;
			System.out.println("Try block");
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		}finally{
			System.out.println("Legend");
		}
		System.out.println("Line 3");
		System.out.println("Line 4");
		System.out.println("Line 5");
	}

}
