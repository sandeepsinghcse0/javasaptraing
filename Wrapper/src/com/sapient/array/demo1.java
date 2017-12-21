package com.sapient.array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class demo1 {
	public static void main(String args[]) {
		String[] arr = new String[4];
		arr[0] = "ram";
		arr[1] = "sam";
		arr[2] = "kam";
		arr[3] = "tam";
		Arrays.sort(arr);
		for(String a:arr)
		{
			System.out.println(a);
		}
		
		Arrays.sort(arr,Collections.reverseOrder());
		
		for(String a:arr)
		{
			System.out.println(a);
		}
	}
}
