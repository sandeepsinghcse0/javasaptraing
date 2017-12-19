package com.sapient.service;

public abstract class Employee {
	
	private int empid;
	private String eName;
	private double sal;
	
	public Employee(int empid, String eNmae, double sal) {
		super();
		this.empid = empid;
		this.eName = eNmae;
		this.sal = sal;
	}
	

	public double getSal() {
		return sal;
	}
	
	public int getEmpid() {
		return empid;
	}



	public String geteName() {
		return eName;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}
	
	public void dispaly()
	{
		System.out.printf("%5d%10s%10.2f",empid,eName,sal);
	}


    public abstract double calcSal();
	

}
