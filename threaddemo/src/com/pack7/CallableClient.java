package com.pack7;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableClient {
  public static void main(String args[]) throws InterruptedException, ExecutionException {
	  
		ExecutorService pool =Executors.newCachedThreadPool();//it will create thread based on demond
		MyCallable callable=new MyCallable();
		 Future<Integer> future =pool.submit(callable);
		 System.out.println("Line 1");
		 System.out.println("Line 2");
		 System.out.println("Line 3");

		 for(int i=0;i<100;i++) {
			 System.out.println("Main thred "+i);
		 }
		 int res=future.get();
		 System.out.println(res);
  }
}
