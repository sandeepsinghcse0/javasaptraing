package com.sapient.service;

public class LoanService {
	public String approveLoan(int age,double income) throws AgeException, IncomeExaception {
		if(age<18||age>40)
			throw new AgeException("You age is less than 18 or graeter than 40");
		if(income<400000)
			throw new IncomeExaception("Income must be greater than four lacks");		
		return "approved";
	}

}
