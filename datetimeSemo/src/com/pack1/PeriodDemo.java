package com.pack1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodDemo {
	public static void main(String args[]) {
		LocalDate dt1=LocalDate.of(2016, 3, 5);
		LocalDate dt2=LocalDate.of(2016, 12, 10);
		Period p=Period.between(dt2, dt1);
		System.out.println(p.getDays()+"  days ");
		System.out.println(p.getMonths()+"  months ");
		System.out.println(p.getYears()+"  years ");
		
		
		
		//duration between datetime or time ,return in second nano
		
		LocalTime t1=LocalTime.of(10, 10);
		LocalTime t2=LocalTime.now();
		Duration d=Duration.between(t1, t2);
		System.out.println(d.getSeconds());
	}

}
