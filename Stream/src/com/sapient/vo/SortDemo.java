package com.sapient.vo;

import java.util.ArrayList;
import java.util.List;

import com.sapient.util.EmpUtil;

public class SortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Emp> lst = new ArrayList<Emp>();
		lst.add(new Emp(1001, "jaydeep", 23000.0));
		lst.add(new Emp(1002, "deep", 123000.0));
		lst.add(new Emp(1009, "jay", 25000.0));
		lst.add(new Emp(1003, "jaydee", 29000.0));
		lst.add(new Emp(1004, "ydeep", 33000.0));

		System.out.println("Sort by Ename in decending order");

		lst.stream().filter(i -> i != null).sorted((e1, e2) -> e2.getEname().compareTo(e1.getEname()))
				.forEach(EmpUtil::display);

		System.out.println("Sort by salery");

		lst.stream().sorted((e1, e2) -> e1.getSal().compareTo(e2.getSal())).forEach(EmpUtil::display);
		
		
		System.out.println("Employees have salery more than 25000");
		
	     lst.stream().filter(i->i.getSal()>25000).sorted().forEach(EmpUtil::display);
	}

}
