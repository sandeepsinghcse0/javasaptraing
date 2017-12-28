package com.pack1;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ConversionDemo {
	
	public static void main(String[] args) {
		//convert instatnt into lovcal date
		
		Instant ins=Instant.now();
		ZonedDateTime zt=ins.atZone(ZoneId.systemDefault());
		LocalDate dt=zt.toLocalDate();
		
		
		// convert localdate in to java.sql.Date
		LocalDate ldt=LocalDate.now();
		java.sql.Date sqldt=Date.valueOf(ldt);
		System.out.println("Sql date  "+sqldt);
		
		//convert java.sql.date into local Date
		LocalDate ltd2=sqldt.toLocalDate();
		System.out.println(ltd2);
	}

}
