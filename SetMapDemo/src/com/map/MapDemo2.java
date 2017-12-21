package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.pack1.Emp;

public class MapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1001, "Sandeep");
		map.put(1002, "Jay");
		map.put(1009, "Dimpal");
		map.put(1005, "Sandi");
		map.put(1006, "Jaydeep");
		map.put(1003, "Dipali");
		map.put(1002, "dekhte h");
		map.put(null, "dekhte h");
		
		System.out.println("iteration using key");
		Set<Integer> set=map.keySet();
		for(Integer key:set)
		{
			System.out.println(key+"            "+map.get(key));
		}
		
		System.out.println("iteration using values");
		Collection<String> col=map.values();
		for(String str:col){
			System.out.println(str);
		}
		
		System.out.println("iteration using EntrySet");
		Set<Entry<Integer,String>> entries=map.entrySet();
		for(Entry e:entries){
			System.out.println(e.getKey()+"          "+e.getValue());
		}

	}

}
