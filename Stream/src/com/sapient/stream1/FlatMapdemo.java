package com.sapient.stream1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapdemo {

	public static void main(String[] args) {
		List<String> lst1=Arrays.asList("ram","tom","sam");
		List<String> lst2=Arrays.asList("rram","ttom","ssam");
		List<String> lst3=Arrays.asList("rrram","tttom","sssam");
		Stream<List<String>> s=Stream.of(lst1,lst2,lst3);
		//s.forEach(System.out::println);
		Stream<String> s1=s.flatMap(lst->lst.stream());
		s1.forEach(System.out::println);
		
		

	}

}
