package com.sapient.client;

import com.sapient.service.Contract;
import com.sapient.service.Employee;
import com.sapient.service.Onroll;

public class EmpClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee[] emp=new Employee[4];
        emp[0]=new Onroll(1001,"Sandeep",35000);
        emp[1]=new Onroll(1002,"Ashwani",55000);
        emp[2]=new Contract(1003,"Shubham",25000,30);
        emp[3]=new Contract(1004,"Shkar",25000,20);
    	
        System.out.printf("====================================================================================================\n");
        System.out.printf("%5s%10s%10s%10s%10s%4s%18s%20s\n", "EID", "ENAME", "SRICE","DA","PA","DAY","TSAL","TYPE");
        System.out.printf("====================================================================================================\n");
        
    	for(Employee em:emp)
    	{
    		em.dispaly();
    	}
    	System.out.printf("====================================================================================================\n");
	}

}
