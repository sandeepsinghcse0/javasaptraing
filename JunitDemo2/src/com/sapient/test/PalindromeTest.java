package com.sapient.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.*;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.sapient.sevice.Factory;
import com.sapient.sevice.Palindrome;

@RunWith(JUnitPlatform.class)
public class PalindromeTest {
	
	@Test
	public void tetsReverse1() {
		Palindrome ser=Factory.getPalindromeService();		
		assumeTrue(ser!=null);
	}


}
