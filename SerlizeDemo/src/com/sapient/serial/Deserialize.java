package com.sapient.serial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Deserialize {
	
	public static void main(String args[]) throws IOException, ClassNotFoundException {
	
	FileInputStream fis=new FileInputStream("employee.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	Emp emp=null;
	 try{
	    while((emp=(Emp)ois.readObject())!=null)
	    {
	    	System.out.println(emp);
	    }
	 }
	 catch(Exception e){
		 
	 }
	}

}
