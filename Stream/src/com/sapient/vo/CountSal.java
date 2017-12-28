package com.sapient.vo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.sapient.util.EmpUtil;

public class CountSal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Emp> lst = new ArrayList<Emp>();
		lst.add(new Emp(1001, "jaydeep", 23000.0));
		lst.add(new Emp(1002, "deep", 123000.0));
		lst.add(new Emp(1009, "jay", 25000.0));
		lst.add(new Emp(1003, "jaydee", 29000.0));
		lst.add(new Emp(1004, "ydeep", 33000.0));
		
		System.out.println("Employee having salery more than 25000");
		List<Emp> lst1=lst.stream().filter(e->e.getSal()>25000).collect(Collectors.toList());
		lst1.stream().forEach(EmpUtil::display);
		
		

	}

}
