package com.pack7;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		int sum=0;
		for(int i=0;i<=500;i++) {
			sum+=1;
			System.out.println("Callable running"+i);
		}
		return sum;
	}

}
