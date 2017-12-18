package com.sapient.service;

public class Emp {
	private String name;
	private String  busUnit="RazorFish";
	private int age;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) throws Exception  {
		if(!name.matches("[a-zA-z]{3,15}"))
			throw new Exception("Name must contain 3-15 alphabets");
		this.name = name;
	}
	public String getBusUnit(){
		return busUnit;
	}
	public int getAge()  throws Exception {
		if(!(age>1 && age<60))
			throw new Exception("Age must be graeter than 18 and less than 60");
		return age;
	}
	public void setAge(int age)  throws Exception {
		this.age = age;
	}
}
