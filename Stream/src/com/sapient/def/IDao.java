package com.sapient.def;

import java.util.List;

public interface IDao {
	public void m1();
	public void m2();
	
	public default void m3(List<String> lst) {
	   System.out.println(lst);
	}

}
