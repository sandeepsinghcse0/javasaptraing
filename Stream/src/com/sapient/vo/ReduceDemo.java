package com.sapient.vo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Emp> lst = new ArrayList<Emp>();
		lst.add(new Emp(1001, "jaydeep", 23000.0));
		lst.add(new Emp(1002, "deep", 123000.0));
		lst.add(new Emp(1009, "jay", 25000.0));
		lst.add(new Emp(1003, "jaydee", 29000.0));
		lst.add(new Emp(1004, "ydeep", 33000.0));
		
		
		Double sum=lst.stream().map(e->e.getSal()).reduce(0.0,(x,y)->x+y);
        System.out.println(sum);
	}

}
