package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<Integer>();
		 lst.add(10);
		 lst.add(97);
		 lst.add(13);
		 lst.add(4);
		 lst.add(5);
		 lst.add(66);
	Integer res=	 lst.stream().map(i->i).reduce(0,(x,y)->x+y);//x=sum and sum=0 initialy
		System.out.println(res); 
		Integer res1=	 lst.stream().map(i->i).filter(i->i%2==0).reduce(0,(x,y)->x+y);
		System.out.println("Sum of even no"+res1); 

	}

}
