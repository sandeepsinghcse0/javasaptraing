package com.sapient.demo;

import java.util.Scanner;

public class intrest {
	
	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the amout");
       double prin=scan.nextDouble();
       System.out.println("Enter the years");
       int year=scan.nextInt();
       System.out.println("Enter the rate");
       float rate=scan.nextFloat();
       double simapleintrest=calcSimple(prin,year,rate);
       double compoundintrest=clacCompound(prin,year,rate);
        System.out.println("simple intrest="+simapleintrest);
        System.out.println("Compound intrest="+compoundintrest);
        scan.close();
	}
	
	
   public static double calcSimple(double amt,int years,float rate){
	   double si=amt*rate*years/100;
	   return si;
   }
   
   public static double clacCompound(double amt,int years,float rate){
	   double ci= amt*Math.pow(1+rate/100,years);
	   return ci;
   }
}
