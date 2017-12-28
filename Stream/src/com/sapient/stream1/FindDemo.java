package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class FindDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst=new ArrayList<String>();
		 lst.add("Ram");
		 lst.add("Sam");
		 lst.add("tam");
		 lst.add("sen");
		 lst.add("ren");
		 lst.add("tenn");
		 
		Optional opt= lst.stream().filter(s->s.startsWith("t")).findAny();
		System.out.println(opt);
        if(opt.isPresent()){
        	System.out.println("element found");
        }else{
        	System.out.println("element not found");
        }
        
        
        Optional opt1= lst.stream().filter(s->s.startsWith("t")).findFirst();
		System.out.println(opt1);
        if(opt1.isPresent()){
        	System.out.println("element found");
        }else{
        	System.out.println("element not found");
        }
	}

}
