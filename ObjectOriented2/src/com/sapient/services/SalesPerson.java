package com.sapient.services;

public class SalesPerson {
	public int id;
	public String Name;
	public double samt;// sales amount
	public static int noOfPerson;
	public static double tsales;
   
	public SalesPerson(int id, String name, double samt) {
		super();
		this.id = id;
		Name = name;
		this.samt = samt;
		++noOfPerson;
		tsales+=this.samt;
	}

	public double calcSalesComm(){
	   double sc=0;
	   if(samt>=5000)
	   {
		   sc=samt*.10;
	   }
	   else if(samt>=20000)
	   {
		   sc=samt*.05;
	   }
	   else 
	   {
		   sc=samt*.03;
	   }
		   return sc;
		   
   }
	
	public void dispaly()
	{
		System.out.println(id+" "+Name+"  "+samt);
		System.out.println("---------------------------------------------------------");
	}
}
