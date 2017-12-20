package com.sapient.demo;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[])
	{
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(dofact(n));
		scan.close();
	}
	public static int dofact(int n)
	{
		if(n<=1)
			return 1;
		else
			return dofact(n-1)*n;
	}

}
