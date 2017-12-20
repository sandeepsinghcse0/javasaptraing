package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ViewEmpByName {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the eid");
		int eid=sc.nextInt();
	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url, "system", "sapient");
		String sql = "select * from employee where eid = ?";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setInt(1, eid);
		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			System.out.print(rs.getInt("eid")+"                 ");
			System.out.print(rs.getString("ename")+"             ");
			System.out.print(rs.getInt("sal")+"                  ");
			System.out.print(rs.getDate("DOJ")+"               \n-----------------------------------------------------------------------------------------------\n");
		}
       conn.close();
       sc.close();
	}

}
