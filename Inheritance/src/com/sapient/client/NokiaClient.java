package com.sapient.client;

import com.sapient.service.Nokia1100;
import com.sapient.service.NokiaLumia;

public class NokiaClient {
   
	public static void main(String args[]){
		NokiaLumia mobile =new NokiaLumia();
		mobile.browseNet();
		mobile.captureImage();
		mobile.doConverse();         
	}
}
