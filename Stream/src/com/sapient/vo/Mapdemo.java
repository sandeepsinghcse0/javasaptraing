package com.sapient.vo;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

import com.sapient.util.EmpUtil;

public class Mapdemo {

	public static void main(String[] args) {
		List<Emp> lst = new ArrayList<Emp>();
		lst.add(new Emp(1001, "jaydeep", 23000.0));
		lst.add(new Emp(1002, "deep", 123000.0));
		lst.add(new Emp(1009, "jay", 25000.0));
		lst.add(new Emp(1003, "jaydee", 29000.0));
		lst.add(new Emp(1004, "ydeep", 33000.0));
		
		Stream<Emp> s=lst.stream().map(e->{e.setSal(e.getSal()+e.getSal()*0.1); return e;});
        s.forEach(EmpUtil::display);
        
        //original
        System.out.println("------------------------------------------------------");
        lst.forEach(EmpUtil::display);
        
        
        System.out.println("max sal----------------------------");
      OptionalDouble optd=  lst.stream().mapToDouble(e->e.getSal()).max();
      System.out.println(optd.getAsDouble());
      
	}
}
