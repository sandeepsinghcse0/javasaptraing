package com.sapient.exceptions;

public class Demo2 {

	public static void main(String[] args) {
	     String res=approvedLoan(18, 300000);
	     System.out.println(res);

	}

	public static String approvedLoan(int age,double income){
		String res=null;
		try {
			res=processLoan(age,income);
			return res;
		} catch (AgeException | IncomeException e) {	
			return e.getMessage();
		}
		finally {
			System.out.println("finally block");
	}
		}
	
	
	
	public static String processLoan(int age,double income) throws AgeException, IncomeException{
		if(age<20 || age>40){
			throw new AgeException("Age must me greater than 20 and less than 40");
		}
		
		if(income<400000)
		{
			throw new IncomeException("Income must me greater 400000");
		}
		return "Loan approved";
	}

}
