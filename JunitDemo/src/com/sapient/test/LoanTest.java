package com.sapient.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.sapient.service.AgeException;
import com.sapient.service.IncomeExaception;
import com.sapient.service.LoanService;

@RunWith(JUnitPlatform.class)
public class LoanTest {
	
	
	private static LoanService ser;
	
	@BeforeAll
	public static void beforeAll() {
		ser=new LoanService();
	}
	
	@Tag("prod")
	@Test
	public void testLoan1() throws IncomeExaception,AgeException{
		
		assertEquals("approved", ser.approveLoan(20, 400000));
		
	}
	@Tag("prod")
	@Test	
	public void testLoan2() throws IncomeExaception,AgeException{	
		assertEquals("approved", ser.approveLoan(40, 600000));	
	}
	@Tag("dev")
	@Test
	public void testLoan3() throws IncomeExaception,AgeException{		
		assertThrows(IncomeExaception.class, ()->ser.approveLoan(19, 300000));	
	}
	@Tag("dev")
	@Test
	public void testLoan4() throws IncomeExaception,AgeException{		
		assertThrows(IncomeExaception.class, ()->ser.approveLoan(19, 300000));	
	}

}
