package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Account;
import com.sapient.service.Loan;
import com.sapient.service.Savings;

public class AccountClient {

	
	private static Account[] arr=new Account[2];
	static{
		arr[0]=new Savings(1001,"Sandeep",5000);
		arr[1]=new Loan(1002,"Amit",25000);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan =new Scanner(System.in);
        String opt=null;
        int accountype=0;
        double amt=0;
        
        do{
        	System.out.println("Enter 0 for Saving  1 for Loan");
        	accountype=scan.nextInt();
            if(accountype<0 && accountype>1)
            {
            	System.out.println("Invalid account type");
            }
            else{
            	System.out.println("Enter amount");
            	amt=scan.nextDouble();
            	 arr[accountype].deposit(amt);
            	 arr[accountype].display();
            }
        }while(scan.next()=="Y");
        
	}

}
