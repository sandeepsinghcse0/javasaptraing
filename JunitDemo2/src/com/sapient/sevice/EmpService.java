package com.sapient.sevice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sapient.vo.Emp;

public class EmpService {

	static Connection conn = null;
	static PreparedStatement st = null;
	static String query = null;
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SYSTEM", "sapient123");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		query = "select eid,ename,sal from sap_employee where eid=?";
		try {
			st = conn.prepareStatement(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Emp getEmployee(int empId) throws NotFoundException, SQLException {
		Emp emp = null;
		st.setInt(1, empId);
		ResultSet rs = st.executeQuery();
		int eid, sal;
		String ename;
		if (rs.next()) {
			eid = rs.getInt("eid");
			ename = rs.getString("ename");
			sal = rs.getInt("sal");
			emp = new Emp(eid, ename, sal);
			return emp;

		}
		else {
			throw new NotFoundException("NotFoundException");
		}
	}

	/*public static void main(String args[]) {
		EmpService e1 = new EmpService();
		try {
			e1.getEmployee(1001);
		} catch (NotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}*/
}
