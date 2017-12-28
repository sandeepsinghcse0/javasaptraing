package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ShortDemo {

	public static void main(String[] args) {
		List<String> lst=new ArrayList<String>();
		 lst.add("Ram");
		 lst.add("Sam");
		 lst.add("tam");
		 lst.add("Ben");
		 lst.add("ten");
		 lst.add("Kenn");
		 
		 System.out.println("assending order");
		 Stream<String> s=lst.stream().sorted();
		 s.forEach(System.out::println);
		 System.out.println("decending order");
		 lst.stream().sorted((i,j)->j.compareTo(i)).forEach(System.out::println);

	}

}
