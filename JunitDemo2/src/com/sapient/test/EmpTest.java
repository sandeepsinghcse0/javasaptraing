package com.sapient.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.sapient.sevice.EmpService;
import com.sapient.sevice.Factory;
import com.sapient.sevice.NotFoundException;
import com.sapient.vo.Emp;

@RunWith(JUnitPlatform.class)
public class EmpTest {
	
	@Test
	public void testEmp() throws NotFoundException{
		Emp e1=new Emp(1001,"ram",9000);
		Emp e2=new Emp(1001,"ram",9000);
		assertEquals(e1,e2);
	}
	
	@Test
	public void testEmp2() throws NotFoundException, SQLException{
		EmpService ser=Factory.getEmpService();
		assumeTrue(ser!=null);
		Emp expected =new Emp(1002,"Tom",15000);
		assertEquals(expected, ser.getEmployee(1002));
	}
	
	@Test
	public void testEmp3() throws NotFoundException{
		EmpService ser=Factory.getEmpService();
		assumeTrue(ser!=null);
		assertThrows(NotFoundException.class,()->ser.getEmployee(1016));
	}

}
