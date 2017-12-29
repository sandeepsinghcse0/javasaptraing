package com.sapient.sevice;

public class Palindrome {
	
	
	  public Palindrome() {
		
	}
	public boolean checkPalindrome(String str)
	{
		if(str==null)
			return false;
		StringBuffer sb=new StringBuffer(str);
		if(str.length()>0&&str.equals(sb.reverse().toString()))
		   return true;
		   else {return false;}		
	}
	
	public String reverseString(String str) {
		
		StringBuffer sb=new StringBuffer(str);
		String rev=new String(sb.reverse());
		return rev;		
	}
	

}
