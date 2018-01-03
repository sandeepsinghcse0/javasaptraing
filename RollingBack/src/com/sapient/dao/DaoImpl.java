package com.sapient.dao;

import com.sapient.exception.IdException;
import com.sapient.vo.Account;


import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DaoImpl implements IDao{

	private static Map<Integer,Account> amap;
	
	
	private static Logger logger=LoggerFactory.getLogger("sapient");
	
	
	static {
		logger.trace("static block called in dao");
		amap=new HashMap<Integer,Account>();
		amap.put(1001, new Account(1001, "Govind",200000));
		amap.put(1002, new Account(1002, "Ganesh",20000));
		amap.put(1003, new Account(1003, "sandeep",18000));
		logger.debug("hashmap initialized with two parameter");
	}
	
	@Override
	public Account getAccount(int accid) throws IdException {
		logger.trace("getAccount() invoked");
		logger.debug("i sda");
		if(!amap.containsKey(accid)) {
			throw new IdException("Account does not exist");
		}
		logger.info("accont found");
			return amap.get(accid);
	}

}
