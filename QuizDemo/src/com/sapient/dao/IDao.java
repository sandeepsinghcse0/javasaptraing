package com.sapient.dao;

import java.sql.SQLException;
import java.util.Map;

import com.sapient.vo.Question;

public interface IDao {
	
	Map<Integer, Question> viewQuestions() throws SQLException;

}
