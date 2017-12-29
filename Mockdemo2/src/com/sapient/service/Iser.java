package com.sapient.service;

import java.util.List;
import com.sapient.vo.Emp;

@SuppressWarnings("hiding")
public interface Iser<Emp> {
	
	List<Emp> viewEmployee(String order);

}
