package com.sapient.test;


import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.sapient.dao.IDao;
import com.sapient.exception.BalanceException;
import com.sapient.exception.IdException;
import com.sapient.service.Iser;
import com.sapient.service.SerImpl;
import com.sapient.vo.Account;

import name.falgout.jeffrey.testing.junit5.MockitoExtension;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class TransferTest {
	
	
	@Mock
	IDao dao;
	
	
	@InjectMocks
	Iser ser=new SerImpl();
	
	private static Account acc1,acc2,acc3;

	@BeforeAll
	public static void beforeAll() {
		acc1=new Account(1001,"ram",10000);
		acc2=new Account(1002,"ram",5000);
		acc3=new Account(1003,"sam",2000);
	}
	
	@BeforeEach
	public void before() throws IdException,BalanceException{
		when(dao.getAccount(1001)).thenReturn(acc1);
		when(dao.getAccount(1002)).thenReturn(acc2);
		when(dao.getAccount(1003)).thenReturn(acc3);
		
	}
	
	//()->ser.transferFund(1002,1001,5000)
	@Test
	public void testFund1() throws IdException,BalanceException{
		 assertTrue(ser!=null);
		 assertAll("transfer fund",()->ser.transferFund(1002,1001,5000),
				                   ()->ser.transferFund(1002,1001,5000)			                   
				                 );
		}
		
	
	@Test
	public void testFund2() throws IdException,BalanceException{
	 assertTrue(ser!=null);
	 assertThrows(BalanceException.class, ()->ser.transferFund(1003,1002,5000));
	}
	
}
