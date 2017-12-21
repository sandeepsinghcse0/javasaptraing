package com.sapient.wraper;

public class Boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a=10;          //it is automatically converting primitive to Wrapper
		Integer b=new Integer(20);  //boxing
		
		int res=a.intValue()+b.intValue();//unboxing
		Integer c= new Integer(res);
		System.out.println(c);
	}

}
