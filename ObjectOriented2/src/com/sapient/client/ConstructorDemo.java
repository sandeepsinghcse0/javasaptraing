package com.sapient.client;

import com.sapient.services.Car;

public class ConstructorDemo {
   public static void main(String args[]){
	   
	   try{
			   Car car=new Car(1000,"Audi");
			   car.dispaly();
	   }
	     catch(Exception e)
	     {
		   System.out.println(e.getMessage());
	     }
	   
	   }
}
