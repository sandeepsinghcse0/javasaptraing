package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.pack1.Emp;

public class Demo1 {
	public static void main(String args[]) {
		Emp e1=new Emp(1005,"ram",69000);
		Emp e2=new Emp(1006,"ramesh",69200);
		Emp e3=new Emp(1007,"ramu",59000);
		Emp e4=new Emp(1008,"rampal",83000);
		Emp e5=new Emp(1009,"rameshwar",10000);
		
		Map<Integer, Emp> map=new HashMap<Integer, Emp>();
		map.put(1005, e1);
		map.put(1006, e2);
		map.put(1007, e3);
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enetr empId");
		int eid =scan.nextInt();
		if(map.containsKey(eid)){
			Emp e=map.get(eid);
			System.out.println(e);
		}
		else{
			System.out.println("Not found");		}
		
	}
	

}
