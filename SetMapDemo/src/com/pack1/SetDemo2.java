package com.pack1;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {

	public static void main(String[] args) {
		Emp e1=new Emp(1005,"ram",69000);
		Emp e2=new Emp(1006,"ramesh",69200);
		Emp e3=new Emp(1007,"ramu",59000);
		Emp e4=new Emp(1008,"rampal",83000);
		Emp e5=new Emp(1009,"rameshwar",10000);
		Emp e6=new Emp(1005,"ramdhani",70000);
		Emp e7=e6;
		Set<Emp> set=new HashSet<Emp>();
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		set.add(e7);
		
		for(Emp emp:set){
			System.out.println(emp);
		}
	}

}
