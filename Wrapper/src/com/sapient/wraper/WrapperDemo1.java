package com.sapient.wraper;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

public class WrapperDemo1 {

	public static void main(String[] args) {
		//Convert String into primtive
		String str1="67";
		String str2="4.5";
		int val1=Integer.parseInt(str1);
		double val2=Double.parseDouble(str2);
        double res=val1*val2;
        System.out.println(res);
        
        //find size
        
        System.out.println("Size of float "+Float.SIZE );
        
	}

}
