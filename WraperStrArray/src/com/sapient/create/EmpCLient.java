package com.sapient.create;

public class EmpCLient{

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub
		Class cls=Class.forName("com.sapient.create.Emp");
        Emp emp=(Emp)cls.newInstance();
	}

}
