package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Interest;

public class InterestClient {
	public static void main(String args[]) {
		Interest ob = new Interest();
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter the amount");
			double pamt=sc.nextDouble();
			ob.setAmt(pamt);
			System.out.println("Enter the no years");
			int years=sc.nextInt();
			ob.setYears(years);
			System.out.println("Enter the rate devided by 100");
			float rate=sc.nextFloat();
			ob.setRate(rate);

			double si = ob.calcSimple();
			double cm = ob.clacCompound();
			System.out.println("Simple Interest   " + si);
			System.out.println("Compound Interest  " + cm);
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
