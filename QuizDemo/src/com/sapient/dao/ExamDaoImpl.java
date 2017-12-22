package com.sapient.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import com.sapient.util.ExamUtil;
import com.sapient.vo.Question;

public class ExamDaoImpl implements IDao{

	static {
		try{
			String class1;
			Class.forName(ExamUtil.DRIVER);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			
		}
	}
	
	private static IDao dao=new ExamDaoImpl();
	
     private ExamDaoImpl() {
		// client should not cerate instance
    	 
	}
	
    public static IDao getDaoInstance(){
		return dao;
    	
    }
     
     
	@Override
	public Map<Integer, Question> viewQuestions() {
		Map<Integer,Question> map=new HashMap<Integer,Question>();
		//Question ques=null;
		int qid;
		String qdesc;
		String opta;
		String optb;
		String optc;
		String answer;
		String url=ExamUtil.URL;
		String user=ExamUtil.UNAME;
		String pwd=ExamUtil.PWD;
		
		try(Connection conn = DriverManager.getConnection(url,user, pwd);){
			String sql="select * from questions";
			PreparedStatement st = conn.prepareStatement(sql);
			ResultSet rs = st.executeQuery();
			
			while(rs.next())
			{
				qid=rs.getInt("QID");
                qdesc=rs.getString("QDESC");
                opta=rs.getString("OPTIONA");
                optb=rs.getString("OPTIONB");
                optc=rs.getString("OPTIONC");
                answer=rs.getString("ANSWER");
                map.put(qid, new Question(qid,qdesc,opta,optb,optc,answer));
			}
		}
		catch(SQLException ex){
			ex.printStackTrace();
		}	
		return map;
	}

}
