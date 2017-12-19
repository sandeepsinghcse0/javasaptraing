package com.sapient.service;

public class Onroll extends Employee {
    
	private double da,pf;

	public Onroll(int empid, String eNmae, double sal) {
		super(empid, eNmae, sal);
		this.da =calcda();
		this.pf = calcpa();
	}

	@Override
	public double calcSal() {
		double sal=getSal();
		double netsal=sal+da-pf;
		return netsal;
	}
	
	public double calcda() {
		double sal=getSal();
		return sal*.4;
	}
	
	public double calcpa() {
		double sal=getSal();
		return sal*.12;
	}

	@Override
	public void dispaly() {
		// TODO Auto-generated method stub
		super.dispaly();
		System.out.printf("%10.2f%10.2f%22.2f %20s\n", da, pf,calcSal(), getClass().getSimpleName());
	}

   
	
	
}
