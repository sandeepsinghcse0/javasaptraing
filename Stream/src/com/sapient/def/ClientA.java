package com.sapient.def;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClientA {
	public static void main(String args[]) {
		
		IDao dao=new DaoImpl2();
		dao.m1();
		List<String> lst=Arrays.asList("Ram","Tom","Sam");
		dao.m3(lst);
	}
	

}
