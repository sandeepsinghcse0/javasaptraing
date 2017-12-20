package com.sapient.demo;

public class VarriengArgument {

	public static void main(String args[]) {
        int res=sum(4,9,15,8);
        System.out.println(res);
	}

	public static int sum(int... arr) {
		System.out.println("var args called");
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	
}
