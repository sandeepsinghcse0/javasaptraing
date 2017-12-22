package com.sapient.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import com.sapient.dao.ExamDaoImpl;
import com.sapient.dao.IDao;
import com.sapient.util.ExamUtil;
import com.sapient.vo.Answer;
import com.sapient.vo.Question;

public class ExamSerImpl implements IExamSer{
	
	private static IExamSer ser=new ExamSerImpl();
	private Map<Integer, Question> qmap=null;
	
	private ExamSerImpl(){
		
	}
	

	@Override
	public List<Question> genrateQuestions() throws SQLException {
		List<Question> list=new ArrayList<Question>();
		Question ques=null;
		Set<Integer> set=ExamUtil.genUniqueNos(5);
		
        IDao dao=ExamDaoImpl.getDaoInstance();
        if(qmap==null)
        	qmap=dao.viewQuestions();
 
        for(int eid:set){
        	ques=qmap.get(eid);
        	list.add(ques);
        }
		return list;
	}




	@Override 
	public int evaluate(List<Answer> aList) { 
			int score = 0; 
	 		Question ques = null; 
	 		for (Answer answer : aList) { 
	 			ques = qmap.get(answer.getQid());
	 			
	 			//System.out.println(ques.getAnswer()+"  "+answer.getAns());
	 			if (ques.getAnswer().equalsIgnoreCase(answer.getAns())) 
 				  ++score; 
		} 
			return score; 
	 	} 


	public static IExamSer getDaoInstance() {
		// TODO Auto-generated method stub
		return ser;
	}

}
