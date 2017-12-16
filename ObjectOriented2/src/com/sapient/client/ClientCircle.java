package com.sapient.client;

import java.util.Scanner;

import com.sapient.services.Circle;
import com.sapient.services.Interest;

public class ClientCircle {
 
	  public static void main(String args[])
	     {
	    	 Circle ob = new Circle();
	    	 Scanner sc=new Scanner(System.in);
	    	 System.out.println("enter the redious");
	    	 ob.redious=sc.nextDouble();
	    	 System.out.println("Area of circle"+ob.Area());
	    	 System.out.println("Perimeter of circle"+ob.Area());
	    	 sc.close();
	     }
	
}
