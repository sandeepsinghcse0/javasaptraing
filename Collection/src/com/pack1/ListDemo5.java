package com.pack1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListDemo5 {
	public static void main(String args[]) {

		List<String> lst = new ArrayList<String>();
		lst.add("ABC");
		lst.add("ram");
		lst.add("CDE");
		lst.add("FGH;");

		lst.add("IJK");
		lst.add("LMN");
		System.out.println(lst);
		lst.add(2,"Vikram");
		System.out.println(lst);
		System.out.println(lst.remove(4));
		System.out.println(lst);
		System.out.println(lst.size());
		System.out.println("element at index 2 "+lst.get(2));
		//----------------------------------------------
		List<String> lst1 = new ArrayList<String>();
		lst1.add("Jam");
		lst1.add("Omp");
		lst1.addAll(lst);
		System.out.println(lst1);
		
	}

}
