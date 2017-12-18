package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Circle;

public class ClientCircle {
  
	public static void main(String aegs[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the redious");
		double rad=sc.nextDouble();
		try{
	      	Circle cir =new Circle(rad);
	      	double area=cir.calcArea();
	      	double peri=cir.calcPerimeter();
	      	System.out.println("area of circle: "+area);
	      	System.out.println("perimeter of circle: "+peri);

		}
	  catch(Exception e){
		  System.out.println(e.getMessage());
	  }
		sc.close();
	}
}
