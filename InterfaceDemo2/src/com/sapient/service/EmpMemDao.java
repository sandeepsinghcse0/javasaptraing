package com.sapient.service;

import java.util.ArrayList;
import java.util.List;

public class EmpMemDao implements Idao {

	 EmpMemDao(){
		 System.out.println("Emp mem dao ibnstance created");
	}
	public List<String> viewEmployee() {
		List<String> list=new ArrayList<String>();
		list.add("Ram");
		list.add("Shyam");
		return list;
	}
	
}
