package com.sapient.client;

import com.sapient.service.Emp;

public class EmpClient2 implements Cloneable {

	
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
        Emp e1 =new Emp(1001,"Rama");
        Emp e2= e1.clone();
        System.out.println(e1==e2);
	}
}
