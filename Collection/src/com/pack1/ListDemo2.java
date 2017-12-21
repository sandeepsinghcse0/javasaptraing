package com.pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListDemo2 {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("Chup");
		lst.add("ram");
		lst.add("ku");
		lst.add("bo;");

		lst.add("rha");
		lst.add("h");
		
		Collections.sort(lst);
		System.out.println(lst);
		
		//first way to itrate
		
		for(String str:lst)
		{
			System.out.print(str+"  ");
		}
		
		
		//second way itrate
		
	     Iterator<String> it=lst.listIterator();
	     
	     while(it.hasNext()){
	    	 System.out.print(it.next()+"  ");
	     }
	
	     //Iterator<String> it2=lst.listIterator();


	}

}
