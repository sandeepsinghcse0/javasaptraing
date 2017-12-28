package com.sapient.test;

public class Palindrome {
	
	public boolean checkPalindrome(String str)
	{
		if(str==null)
			return false;
		StringBuffer sb=new StringBuffer(str);
		if(str.length()>0&&str.equals(sb.reverse().toString()))
		   return true;
		   else {return false;}		
	}
	
	
	

}
