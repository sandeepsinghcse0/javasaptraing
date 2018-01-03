package com.sapient.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sapient.dao.DaoImpl;
import com.sapient.dao.IDao;
import com.sapient.service.Iser;
import com.sapient.service.SerImpl;

public class TransferClient {
	private static Logger logger=LoggerFactory.getLogger("sapient");
	
	
	public static void main(String args[]) {
		logger.trace("main thread start");
		Iser ser=new SerImpl();
		logger.debug("service instance created");
		
		try {
			logger.info("transfer the amount rs 5000 from acc 1003 to 1002");
			ser.transferFund(1003, 1002, 5000);
			logger.info("successfuly transfered");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
