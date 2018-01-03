package com.sapient.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sapient.dao.DaoImpl;
import com.sapient.dao.IDao;
import com.sapient.exception.BalanceException;
import com.sapient.exception.IdException;
import com.sapient.vo.Account;

public class SerImpl implements Iser {

	private IDao dao=new DaoImpl();
	
	
	private static Logger logger=LoggerFactory.getLogger("sapient");

	public void setDao() {
		logger.trace("setDao() invoked");
		logger.debug("injecting dao");
		this.dao = dao;		
		logger.info("dao initialized");
	}


	
	@Override
	public boolean transferFund(int fid, int tid, double amt) throws IdException, BalanceException {
		logger.trace("transferFund() invoked");
        Account from =dao.getAccount(fid);
        logger.debug("from account retrived");
        Account to =dao.getAccount(tid);
        logger.debug("toaccount retrived");
        System.out.println(from.getBal());
        System.out.println(to.getBal());
        if(from.getBal()<amt) {
        	throw new BalanceException("bal is not sufficeient");
        }
        from.setBal(from.getBal()-amt);
        to.setBal(from.getBal()+amt);
		return true;
	}

}
