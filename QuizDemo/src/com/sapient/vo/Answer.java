package com.sapient.vo;

public class Answer {
	
	private int qid;
	private String ans;
	
	
	
	public Answer(int qid,String ans)
	{
		super();
		this.qid=qid;
		this.ans=ans;
	}
	
	
	public int getQid() {
		return qid;
	}
	public String getAns() {
		return ans;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	

}
