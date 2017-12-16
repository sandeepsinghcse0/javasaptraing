package com.sapient.client;

import java.util.Scanner;

import com.sapient.services.Interest;

public class InterestClint {
     public static void main(String args[])
     {
    	 Interest ob = new Interest();
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter the amount");
    	 ob.amt=sc.nextDouble();
    	 ob.years=sc.nextInt();
    	 ob.rate=sc.nextFloat();
    	 sc.close();
    	 double si=ob.calcSimple();
    	 double cm= ob.clacCompound();
    	 System.out.println("Simple Interest   "+si);
    	 System.out.println("Compound Interest  "+cm);
     }
}
