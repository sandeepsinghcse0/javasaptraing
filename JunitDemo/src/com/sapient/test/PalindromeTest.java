package com.sapient.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.sapient.service.Palindrome;

import static org.junit.jupiter.api.Assertions.*;

import junit.framework.AssertionFailedError;

@RunWith(JUnitPlatform.class)
public class PalindromeTest {
	
	public static Palindrome ser;
	
	@BeforeAll
	public static void beforeAll() {
		ser=new Palindrome();
	}
	
	@AfterAll
	public static void afterAll() {
		ser=null;
	}
	
	
	@Test	
	public void testPalindrome() {
		assertFalse(ser.checkPalindrome(null));
	}
	@Test
	public void testPalindrome1() {
		assertFalse(ser.checkPalindrome(null));
	}
	
	@Test
	public void testPalindrome2() {
		assertFalse(ser.checkPalindrome(null));
	}


}
