package com.pack2;

public class RunClient {

	public static void main(String[] args) {
		Runnable r1=new MyRaunnable();
		
		Thread t1=new Thread(r1);
		t1.setName("Jack");
		
		
		Thread t2=new Thread(r1);
		t2.setName("pack");

		t1.start();
		t2.start();
		System.out.println("main over");
	}

}
