package com.sapient.client;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.sapient.dao.DaoFactory;
import com.sapient.dao.Idao;
import com.sapient.vo.Emp;

public class EmpClient {

	static Scanner scan = new Scanner(System.in);
	static Idao dao = DaoFactory.getDaoInstance();

	public static void main(String args[]) {

		String menu = null;
		String opt = null;

		Menu emenu = null;
		do {
			System.out.println("Choose :ADD\nEDIT\nREMOVE\nVIEW\nVIEWALL \n");
			menu = scan.next();

			try {
				emenu = Menu.valueOf(menu);
				processMenu(emenu);
			} catch (Exception e) {

				System.out.println(e.getMessage());
			}
			System.out.println("Press y to continue");
			opt = scan.next();
		} while (opt.equals("y"));

	}

	public static void processMenu(Menu emenu) {
		switch (emenu) {

		case VIEWALL:
			viewall();
			break;

		case VIEW:
			viewbyid();
			break;

		}

	}

	public static void viewall() {
		List<Emp> lst = dao.viewEmployee();
		for (Emp emp : lst) {
			System.out.println(emp);
		}

	}
	
	public static void viewbyid() {
		System.out.println("Enter eid");
		int eid=scan.nextInt();
		List<Emp> lst = dao.viewEmployee();
		try {
			Emp emp=dao.viewEmployee(eid);
			System.out.println(emp);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static void add()
	{
		System.out.println("Enetr eid");
		int eid=scan.nextInt();
		System.out.println("Enetr ename");
		String ename=scan.next();
		System.out.println("Enetr sal");
		int sal=scan.nextInt();
		System.out.println("Enetr deptid");
		int deptid=scan.nextInt();
		System.out.println("Enetr doj");
		String doj=scan.next();
		
		Emp emp=new Emp(eid,ename,sal,deptid,LocalDate.parse(doj));
		
		try{
			dao.addEmployee(eid,emp);
		}catch(Exception e){
			System.out.println(e.getMessage());
			
		}
	}

}
