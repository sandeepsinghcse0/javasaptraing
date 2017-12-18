package com.sapient.client;

import com.sapient.service.Emp;

public class ClientEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp emp=new Emp();
		
		try{
			  emp.setAge(30);
			  emp.setName("Sandeep Singh");
			 System.out.println(emp.getAge()+"  age "+emp.getName()+" Name"+" of bussiness unit"+emp.getBusUnit());
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
