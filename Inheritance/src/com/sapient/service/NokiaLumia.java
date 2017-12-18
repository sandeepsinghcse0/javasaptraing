package com.sapient.service;

public class NokiaLumia extends Nokia1100{
	
   public void captureImage(){
	   doConverse();
	   sendSMS();
	   System.out.println("capture image");
   }
   
   public void browseNet(){
	   System.out.println("browseNet");
   }

@Override
public void doConverse() {
	// TODO Auto-generated method stub
	//super.doConverse();
	System.out.println("converge in 4g");
}
   
   
}
