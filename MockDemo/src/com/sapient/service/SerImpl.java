package com.sapient.service;

import com.sapient.dao.IDao;
import com.sapient.exception.BalanceException;
import com.sapient.exception.IdException;
import com.sapient.vo.Account;

public class SerImpl implements Iser {

	private IDao dao;

	public void setDao() {
		this.dao = dao;
	}

	@Override
	public boolean transferFund(int fid, int tid, double amt) throws IdException, BalanceException {
        Account from =dao.getAccount(fid);
        Account to =dao.getAccount(tid);
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
