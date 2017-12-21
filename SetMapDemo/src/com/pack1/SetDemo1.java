package com.pack1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<String>();
		set.add("Ram");
		set.add("Lakshman");
		set.add("Bharat");
		set.add("Shatrudhan");
		set.add("Hanuman");
		System.out.println( set.add("Ram"));
		for(String str:set){
			System.out.println(str);
		}

	}

}
