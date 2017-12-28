package com.sapient.def;

import java.util.List;

public class DaoImpl2 implements IDao{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("DaoImpl2 m1()");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("DaoImpl2 m2()");
		
	}

	@Override
	public void m3(List<String> lst) {
		// TODO Auto-generated method stub
		lst.forEach(System.out::println);
	}

}
