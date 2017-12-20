package com.sapient.serial;

import java.io.Serializable;

public class Emp implements Serializable{
	

	private int eid;
	private String ename;
	private double sal;
	
	public Emp(int eid, String ename, double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return eid+"  "+ename+"  "+sal;
	}
	
	

}
