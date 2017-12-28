package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class AggDemo {

	public static void main(String[] args) {
		List<Integer> lst=new ArrayList<Integer>();
		 lst.add(10);
		 lst.add(97);
		 lst.add(13);
		 lst.add(4);
		 lst.add(5);
		 lst.add(66);
		 long size=lst.stream().filter(i->i>=50).count();
		 System.out.println(size);
		 
		 OptionalInt opt1= lst.stream().mapToInt(i->i).min();
		 System.out.println("Minimum value "+opt1.getAsInt());
		 
		 OptionalInt opt2= lst.stream().mapToInt(i->i).max();
		 System.out.println("Maximum value "+opt2.getAsInt());
		 
		 int opt3= lst.stream().mapToInt(i->i).sum();
		 System.out.println("sum "+opt3);
		 
		 OptionalDouble opt4= lst.stream().mapToInt(i->i).average();
		 System.out.println("Average "+opt4.getAsDouble());
	}

}
