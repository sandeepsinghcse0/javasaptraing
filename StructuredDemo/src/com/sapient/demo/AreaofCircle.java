package com.sapient.demo;

import java.util.Scanner;

public class AreaofCircle {

	public static void main(String[] args) {
		System.out.println("Enetr the redius");
		Scanner sc =new Scanner(System.in);
		double redius=sc.nextDouble();
		double area=Area(redius);
		double peri=perimeter(redius);
		sc.close();
		System.out.println("Area of circle is :"+area);
		System.out.println("Perimeter of circle is :"+peri);
	}
	
	public static double Area(double redious){
		
		return Math.PI*redious*redious;
	}
	
	public static double perimeter(double redious){
		
		return 2*Math.PI*redious;
	}

}
