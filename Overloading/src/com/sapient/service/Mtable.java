package com.sapient.service;

public class Mtable {

	private int num;

	public Mtable(int num) throws Exception {
	super();	
	if(num<0)
		throw new Exception("Number can not be negative");
	this.num = num;
}
	
   public void display(int row){
	  showTable(1,row);
   }
   
   public void display(){
	  showTable(1,10);
   }
   
   
   public void display(int start,int end) throws Exception{
	   if(start>0 && end>0 && end>start)
	      showTable(start,end);
	   
	   else{
		   throw new Exception("Not legal argument");
	   }
   }
   
   
   @SuppressWarnings("unused")
private void showTable(int start,int end)
   {
	   for(int i=start;i<=end;i++)
		   System.out.printf("%d * %d = %d\n",num,i,(num*i));
   }
   
}
