package com.sapient.array;

public class Demo3 {
	public static void main(String[] args){
		String[] arr={"Ram","Sam","Tam","Kam"};
		String[] arr1=new String[4];
		System.arraycopy(arr, 1, arr1, 0, 3);
		for(String a:arr1)
		System.out.println(a);
	}

}
