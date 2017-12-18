package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Mtable;

public class MtableClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner scan =new Scanner(System.in);
		int num=scan.nextInt();
		
		try{
			Mtable obj=new Mtable(num);
			obj.display(3,3);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
      scan.close();
	}

}
