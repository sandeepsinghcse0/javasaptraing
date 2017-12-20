package com.sapient.service;

public class Emp implements Cloneable {

	private int eid;
	private String name;

	public Emp(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}

	@Override
	public String toString() {
		return eid + " " + name;
	}

	@Override
	public boolean equals(Object obj) {
		Emp emp=(Emp)obj;
		if(this==emp)
			return true;
		else
			if(this.eid==emp.eid  && this.name.equals(emp.name))
		return true;
		else return false;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("The Object GCTED"+eid);
	}

	@Override
	public Emp clone() throws CloneNotSupportedException {
		return (Emp)super.clone();
	}
}
