package com.sapient.service;

public class Contract extends Employee {
    
	private int day;


	public Contract(int empid, String eNmae, double sal, int day) {
		super(empid, eNmae, sal);
		this.day = day;
	}

	@Override
	public double calcSal() {
		double sal=getSal();
		double netsal=sal*day;
		return netsal;
	}

	@Override
	public void dispaly() {
		// TODO Auto-generated method stub
		super.dispaly();
		System.out.printf("%25d%18.2f %20s\n",day,calcSal(), getClass().getSimpleName());
	}
}
