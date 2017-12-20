package com.sapient.text;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class WriteDemo {

	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("sap.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        
        bw.write("Sapient razorfish is first company\n");
        bw.write("++++++******************>>>>>>>>>>>>>>>>\n");
        
        System.out.println("getting");
        bw.close();
        fw.close();
	}
	

}
