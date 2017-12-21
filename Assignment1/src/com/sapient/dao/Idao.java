package com.sapient.dao;
import java.util.List;

import com.sapient.exception.NotFoundException;
import com.sapient.vo.Emp;



public interface Idao {
   List<Emp> viewEmployee();
   Emp viewEmployee(int empId) throws NotFoundException;
   void addEmployee(int eid, Emp emp);
	
}
