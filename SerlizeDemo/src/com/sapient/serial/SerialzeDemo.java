package com.sapient.serial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class SerialzeDemo {

	public static void main(String args[]) throws IOException {
		
		
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter eid");
		int eid=sc.nextInt();
		
		
		System.out.println("Enter ename");
		String ename=sc.next();
		
		
		System.out.println("Enter sal");
		int sal=sc.nextInt();*/
		
		
		
		FileOutputStream fos=new FileOutputStream("employee.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Emp emp=new Emp(1001,"af",21357);
		Emp emp1=new Emp(1002,"sf",21357);
		Emp emp2=new Emp(1003,"gf",21357);
		
		oos.writeObject(emp);
		oos.writeObject(emp1);
		oos.writeObject(emp2);
		
		oos.close();
		fos.close();

	}

}
