package com.pack1;

public class Emp implements Comparable<Emp>{
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return empId;
	}

	@Override
	public boolean equals(Object obj) {
		Emp emp = (Emp) obj;
		if (this.empId == emp.empId)
			return true;
		else
			return false;
	}

	private int empId;
	private String ename;
	private double sal;

	public Emp(int empId, String ename, double sal) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.sal = sal;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return empId + "  " + ename + " " + sal;
	}

	 @Override
	 public int compareTo(Emp o) {
	 //on which field you want to sort
	 Integer e1=this.empId;
	 Integer e2=o.empId;
	 return e1.compareTo(e2);
	 }

	public int getEmpId() {
		return empId;
	}

	public String getEname() {
		return ename;
	}

	public double getSal() {
		return sal;
	}



}
