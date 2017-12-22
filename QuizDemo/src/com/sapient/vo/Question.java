package com.sapient.vo;

public class Question {
	
	private int qid;
	private String qdesc;
	private String qopta;
	private String qoptb;
	private String qoptc;
	private String answer;

	
	public Question(int qid, String qdesc, String qopta, String qopta2, String qota3, String answer) {
		super();
		this.qid = qid;
		this.qdesc = qdesc;
		this.qopta = qopta;
		this.qoptb = qopta2;
		this.qoptc = qota3;
		this.answer = answer;
	}
	
	
	public int getQid() {
		return qid;
	}
	public String getQdesc() {
		return qdesc;
	}
	public String getQopta() {
		return qopta;
	}
	public String getQoptb() {
		return qoptb;
	}
	public String getQoptc() {
		return qoptc;
	}
	public String getAnswer() {
		return answer;
	}

}
