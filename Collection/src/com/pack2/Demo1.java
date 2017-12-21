package com.pack2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		
		Emp e1= new Emp(1001,"sandeep",90000);
		Emp e2= new Emp(1002,"Kuldeep",90000);
		Emp e3= new Emp(1003,"Jaydeep",13000);
		Emp e4= new Emp(1004,"sudeep",34000);
		Emp e5= new Emp(1001,"kudeep",90000);
		Emp e6= new Emp(1001,"tudeep",42000);
		List<Emp> lst=new ArrayList<Emp>();
		lst.add(e1);
		lst.add(e2);
		lst.add(e3);
		lst.add(e4);
		lst.add(e5);
		lst.add(e6);
		
		Collections.sort(lst);
		System.out.println("sorted based on eid");
		for(Emp emp:lst){
			System.out.println(emp);
		}
		
		
		Collections.sort(lst,new NameComparator());
		System.out.println("sorted based on name");
		for(Emp emp:lst){
			System.out.println(emp);
		}
		
		Collections.sort(lst,new SalComparator());
		System.out.println("sorted based on sal");
		for(Emp emp:lst){
			System.out.println(emp);
		}
		

	}

}
