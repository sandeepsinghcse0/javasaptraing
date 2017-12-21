package com.sapient.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sapient.exception.NotFoundException;
import com.sapient.vo.Emp;

public class EmpMemDao implements Idao {
	
	public static Map<Integer,Emp> emap;
	
	static{
		emap=new HashMap<Integer,Emp>();
		emap.put(1001, new Emp(1001,"ram",4500,1,LocalDate.of(2014, 7, 21)));
		emap.put(1002, new Emp(1002,"tam",4500,1,LocalDate.of(2017, 7, 11)));
		emap.put(1003, new Emp(1003,"sam",6500,1,LocalDate.of(2015, 7, 14)));
	}

	@Override
	public List<Emp> viewEmployee() {
		List<Emp> lst=new ArrayList<Emp>();
		lst.addAll(emap.values());
		return lst;
	}

	@Override
	public Emp viewEmployee(int empId) throws NotFoundException {
		return emap.get(empId);
	}
	
	public void addEmployee(int eid,Emp emp) {
		emap.put(eid, emp);
	}

}
