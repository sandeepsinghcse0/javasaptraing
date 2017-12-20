package com.sapient.client;

import com.sapient.service.Calculator;
import com.sapient.service.Findfact;

public class FactorialClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Findfact obj= Calculator.getFindFact();
          System.out.println("factorail of 18"+obj.findFact(18));
	}

}
