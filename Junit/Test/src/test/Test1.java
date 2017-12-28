package test;

import java.util.Stack;

public class Test1 extends Test2 {
	

	public Test1() {
		System.out.println("Constructer child");
	}
	
	public static void main(String args[]) {		
		
		try {
			Thread.sleep(300);
		}
		catch(Exception e){
			System.out.print("ZBCDUHV");
			
		}
		
		
	}
	
	public  void sum(int a,double b) {
		System.out.println("Child");
		return;
	}
	

}
class Test2{
	
	public Test2() {
		System.out.println("Constructer parrent");
	}
	public final int sum(int a,float b) {
		System.out.println("Parent");
		return 0;
	}
	
}


