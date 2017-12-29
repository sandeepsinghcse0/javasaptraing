package com.sapient.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.engine.JupiterTestEngine;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;

import com.sapient.service.CalcService;


@RunWith(JUnitPlatform.class)
public class CalcTest {
	
	public static CalcService ser;
	
	@BeforeAll
	public static void beforeAll() {
		ser=new CalcService();
		System.out.println("Before All");
	}

	
	@AfterAll
	public static void afterAll() {
		ser=null;
		System.out.println("After All");
	}

	public  void beforeEach() {
		System.out.println("After All");
	}
	
	@AfterEach
	public  void afterEach() {
		System.out.println("After All");
	}
	
	
	@Tag("prod")
	@Test
	public void seriesTest1(){
		System.out.println("test1");
		CalcService ser=new CalcService();
		double expected=10.0;
		double actual=ser.calcServices(5,5,10);
		assertEquals(expected,actual);
	}
	
	
	@Tag("dev")
	@Test
	public  void seriesTest2(){
		System.out.println("test2");
		CalcService ser=new CalcService();
		double expected=10.0;
		double actual=ser.calcServices(5,5,10);
		assertEquals(expected,actual);
	}

}
