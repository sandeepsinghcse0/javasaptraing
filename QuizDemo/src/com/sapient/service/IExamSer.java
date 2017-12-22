package com.sapient.service;

import java.sql.SQLException;
import java.util.List;

import com.sapient.vo.Answer;
import com.sapient.vo.Question;

public interface IExamSer {
	
	int evaluate(List<Answer> alist);
	List<Question> genrateQuestions() throws SQLException;

}
