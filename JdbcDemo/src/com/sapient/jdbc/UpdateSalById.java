package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateSalById {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the eid");
		int eid=sc.nextInt();
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url, "system", "sapient");
		String sql = "update employee set sal=sal*10  where eid=?";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setInt(1, eid);
		int rows = st.executeUpdate();
		System.out.println(rows);
		conn.close();
	}

}
