package com.pack1;

public class ThreadClient {

	public static void main(String[] args) {
		MyThread t1=  new MyThread();  //new state
		t1.setName("Ram");
		
		MyThread t2=  new MyThread();
		t1.setName("Sam");
		
		t1.start();
		t2.start();
		
		for(int i=0;i<=1000;i++) {
			System.out.println(Thread.currentThread().getName());
		}

	}

}
