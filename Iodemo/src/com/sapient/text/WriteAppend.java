package com.sapient.text;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteAppend {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("sap.txt",true);
        BufferedWriter bw=new BufferedWriter(fw);
        
        bw.write("Sapient razorfish is first company\n");
        bw.write("++++++******************>>>>>>>>>>>>>>>>\n");
        
        System.out.println("getting");
        bw.close();
        fw.close();
        
	}

}
