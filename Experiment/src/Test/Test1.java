package Test;

public class Test1 extends Test2 {
	
	static {
		System.out.println("Static child");
	}
	{
		System.out.println("instance child");
	}
	public Test1() {
		System.out.println("Constructer child");
	}
	
	public static void main(String args[]) {		
		Test1 ts=new Test1();
		Test1 ts1=new Test1();
	}
	

}
class Test2 extends Test3{
	
	static {
		System.out.println("Static parrent");
	}
	
	{
		System.out.println("instance parrent");
	}
	public Test2() {
		System.out.println("Constructer parrent");
	}
	
}

class Test3{
	
	static {
		System.out.println("Static super  parrent");
	}
	
	{
		System.out.println("instance super parrent");
	}
	public Test3() {
		System.out.println("Constructer super parrent");
	}
}

