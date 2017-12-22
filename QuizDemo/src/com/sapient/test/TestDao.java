package com.sapient.test;

import java.sql.SQLException;
import java.util.Map;
import java.util.Set;

import com.sapient.dao.ExamDaoImpl;
import com.sapient.dao.IDao;
import com.sapient.vo.Question;

public class TestDao {
	public static void main(String args[]) throws SQLException{
		IDao dao=ExamDaoImpl.getDaoInstance();
		Map<Integer, Question> map=dao.viewQuestions();
		System.out.println(map.size());
		
		Set<Integer> set=map.keySet();
		for(int qid:set){
			Question ques=map.get(qid);
			System.out.println(ques.getQid());
			System.out.println(ques.getQdesc());
			System.out.println(ques.getQopta());
			System.out.println(ques.getQoptb());
			System.out.println(ques.getQoptc());
			System.out.println(ques.getAnswer());
			System.out.println("---------------------------------------------------");
			
		}
		
		
	}
	

}
