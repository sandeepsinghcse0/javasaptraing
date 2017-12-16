package com.sapient.client;

import com.sapient.services.SalesPerson;

public class Sales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalesPerson s1=new SalesPerson(1001,"ram",45000);
		//System.out.println(s1.id+" "+s1.Name+"  "+s1.samt);
		s1.dispaly();
		SalesPerson s2=new SalesPerson(1002,"tam",18000);
		s2.dispaly();
		
		SalesPerson s3=new SalesPerson(1003,"sam",5000);
		s3.dispaly();
		
		System.out.println("No of sales person is "+SalesPerson.noOfPerson);
		System.out.println("Total sales is "+SalesPerson.tsales);
	}

}
