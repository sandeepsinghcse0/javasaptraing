package com.sapient.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class EmpFileDao implements Idao {

	EmpFileDao(){
		System.out.println("Emp file dao ibnstance created");
	}
	
	public List<String> viewEmployee(){
		List<String> lst=new ArrayList<String>();
		String str;
		try{
			
			FileReader fr=new FileReader("emp.txt");
			BufferedReader br=new BufferedReader(fr);
			while((str=br.readLine())!=null){
				lst.add(str);
			}
			br.close();
			
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}
		return lst;
	
	}
}
