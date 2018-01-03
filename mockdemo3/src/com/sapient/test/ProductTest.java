package com.sapient.test;


import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.sapient.dao.IProductDao;
import com.sapient.service.Iser;
import com.sapient.service.NotFoundException;
import com.sapient.service.SerImpl;
import com.sapient.vo.Product;

import name.falgout.jeffrey.testing.junit5.MockitoExtension;


@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class ProductTest {
	
	
	@Mock
	IProductDao dao;
	
	
	@InjectMocks
	Iser ser=new SerImpl();
	
	private static Product p1,p2,p3,p4;
	
	private static Map<String,Map<Integer,Product>> catMap;
	
	private static Map<Integer,Product>  compMap;
	private static Map<Integer,Product>  mobileMap;
	private static List<String> p1spec,p2spec,p3spec,p4spec;
	
	
	private static Product expected1,expected2;
	
	@BeforeAll
	public static void beforeAll() {
		p1=new Product(1001, "aspire", 45000);
		p2=new Product(1002, "thinkpad", 55000);
		p3=new Product(1003, "galexyj7", 12000);
		p4=new Product(1004, "s8", 24000);
		
		compMap=new HashMap<>();
		mobileMap=new HashMap<>();
		compMap.put(p1.getProdId(), p1);
		compMap.put(p2.getProdId(), p2);
		
		
		mobileMap.put(p3.getProdId(), p3);
		mobileMap.put(p4.getProdId(), p4);
		
		catMap=new HashMap<>();
		catMap.put("'computer", compMap);
		catMap.put("mobile", mobileMap);
		
		p1spec=Arrays.asList("4gb Ram","1tb hdd","pentium i2");
		p2spec=Arrays.asList("8gb Ram","4tb hdd","pentium i4");
		p3spec=Arrays.asList("2gb Ram","14mp camera","64 storage");
		p4spec=Arrays.asList("4gb Ram","16mp camera","120gb storage");
	}
	
	
	
	@BeforeEach
	public  void beforeEach() {
		p1=new Product(1001, "aspire", 45000);
		p2=new Product(1002, "thinkpad", 55000);
		p3=new Product(1003, "galexyj7", 12000);
		p4=new Product(1004, "s8", 24000);
		
		
		compMap.put(p1.getProdId(), p1);
		compMap.put(p2.getProdId(), p2);
		
		
		mobileMap.put(p3.getProdId(), p3);
		mobileMap.put(p4.getProdId(), p4);
		
		catMap=new HashMap<>();
		catMap.put("computer", compMap);
		catMap.put("mobile", mobileMap);
		
		p1spec=Arrays.asList("4gb Ram","1tb hdd","pentium i2");
		p2spec=Arrays.asList("8gb Ram","4tb hdd","pentium i4");
		p3spec=Arrays.asList("2gb Ram","14mp camera","64 storage");
		p4spec=Arrays.asList("4gb Ram","16mp camera","120gb storage");
	}
	
	
	@Test
	public void testProduct1() throws NotFoundException {
		when(dao.getCatNProds()).thenReturn(catMap);
		when(dao.getProductSpecs("thinkpad")).thenReturn(p2spec);
		Product expected=new Product(1002, "thinkpad", 55000);
		expected.setSpecList(p2spec);
		assertEquals(expected, ser.getProductInfo("computer", 1002));
		
		
	/*	InOrder order=Mockito.inOrder(dao);
		order.verify(dao).getCatNProds();
		order.verify(dao).getProductSpecs("tinkpad");*/
		
	}
	
	
	@Test
	public void testProduct2() throws NotFoundException {
		when(dao.getCatNProds()).thenReturn(catMap);
		when(dao.getProductSpecs("aspire")).thenReturn(p1spec);
		Product expected=new Product(1001, "aspire", 45000);
		expected.setSpecList(p1spec);
		//System.out.println(ser.getProductInfo("computer", 1002));
		assertEquals(expected,ser.getProductInfo("computer", 1001));
	}
	
	
	
	@Test
	public void testProduct3() throws NotFoundException {
		when(dao.getCatNProds()).thenReturn(catMap);
		when(dao.getProductSpecs("galexyj7")).thenReturn(p1spec);
		Product expected=new Product(1003, "galexyj7", 12000);
		expected.setSpecList(p3spec);
		assertEquals(expected, ser.getProductInfo("mobile", 1003));
		
	}
	
	
	@Test
	public void testProduct4() throws NotFoundException {
		when(dao.getCatNProds()).thenReturn(catMap);
		when(dao.getProductSpecs("s8")).thenReturn(p1spec);
		Product expected=new Product(1004, "s8", 24000);
		expected.setSpecList(p4spec);
		assertEquals(expected, ser.getProductInfo("mobile", 1004));
		
	}
	
	@Test
	public void testProduct5() {
		when(dao.getCatNProds()).thenReturn(catMap);
		assertThrows(NotFoundException.class, ()->ser.getProductInfo("mobile", 1001));
	}
	
	@Test
	public void testProduct6() {
		when(dao.getCatNProds()).thenReturn(catMap);
		assertThrows(NotFoundException.class, ()->ser.getProductInfo("computer", 1003));
	}
	

}
