package com.sapient.client;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sapient.dao.ExamDaoImpl;
import com.sapient.dao.IDao;
import com.sapient.service.ExamSerImpl;
import com.sapient.service.IExamSer;
import com.sapient.vo.Answer;
import com.sapient.vo.Question;

public class Client {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Start quiz");
		IExamSer ser=ExamSerImpl.getDaoInstance();
		List<Answer> aList = new ArrayList<Answer>();
		List<Question> lst=ser.genrateQuestions();
		Answer answer;
		int i=0;
		for(Question ques:lst){
			System.out.println(++i+"   "+ques.getQdesc());
			System.out.println(ques.getQopta());
			System.out.println(ques.getQoptb());
			System.out.println(ques.getQoptc());
			String ans1 = scan.nextLine(); 
	     	answer = new Answer(ques.getQid(),ans1); 
		    aList.add(answer); 
		    System.out.println("-----------------------------------"); 

		}
		
		int score = ser.evaluate(aList); 
		System.out.println("Your Score is " + score); 
 		scan.close(); 

	}

}
