package com.sapient.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.sapient.service.CalcService;

@RunWith(JUnitPlatform.class)
public class RoundTest {
	
	@Test
	public void testRound1() {
		CalcService ser=new CalcService();
		double expected=56.3;
		double actual=ser.round2N(56.32878,1);
		assertEquals(expected,actual);
	}

	
	@Test
	public void testRound2() {
		CalcService ser=new CalcService();
		double expected=56.0;
		double actual=ser.round2N(56.32878,0);
		assertEquals(expected,actual);
	}

}
