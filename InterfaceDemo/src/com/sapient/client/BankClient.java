package com.sapient.client;

import com.sapient.sevice.Atm;
import com.sapient.sevice.Bank;

public class BankClient {
	
	public static void main(String args[]){
	Atm atm=Bank.getAtm();
	atm.deposit();
	atm.withdraw();
	atm.getBal();
	}

}
