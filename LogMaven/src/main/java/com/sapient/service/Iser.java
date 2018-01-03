package com.sapient.service;

import com.sapient.exception.BalanceException;
import com.sapient.exception.IdException;

public interface Iser {
	
	public boolean transferFund(int fid,int tid,double amt) throws IdException,BalanceException;
}
