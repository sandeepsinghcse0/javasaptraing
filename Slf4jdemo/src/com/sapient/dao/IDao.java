package com.sapient.dao;

import com.sapient.exception.IdException;
import com.sapient.vo.Account;

public interface IDao {

	public Account getAccount(int accid) throws IdException;
}
