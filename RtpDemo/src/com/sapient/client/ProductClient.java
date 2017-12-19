package com.sapient.client;

import com.sapient.service.Computer;
import com.sapient.service.Mobile;
import com.sapient.service.Product;

public class ProductClient {

	public static void main(String args[])
	{
		Product[] arr=new Product[4];
		arr[0]=new Computer(1001,"Acer laptop",35000,"4TB");
	    arr[1]=new Computer(1002,"HP laptop",67000,"8TB");
	    arr[2]=new Mobile(1003,"Samsung",9000,"12MP");
	    arr[3]=new Mobile(1004,"IPhoneX",35000,"16MP");
	    
	    System.out.printf("====================================================================================================\n");
	    System.out.printf("%10s%20s%10s%10s%10s%20s%20s\n", "PID", "PNAME", "PRICE","HDD","CAMERA","RANGE","TYPE");
	    System.out.printf("======================================================================================================\n");	
	    for(Product ar:arr)
	    {
	    	ar.display();
	    }
	    System.out.printf("=====================================================================================================");	
		
	}
}
