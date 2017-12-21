package com.sapient.array;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr={"Ram","Sam","Tam","Kam"};
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enetr a String");
		String key=scan.next();
		Arrays.sort(arr);
		int res=Arrays.binarySearch(arr, key);
		
		if(res>=0){
			System.out.println("Found at index"+res);
		}
		else{
			System.out.println("Not found");
		}

	}

}
