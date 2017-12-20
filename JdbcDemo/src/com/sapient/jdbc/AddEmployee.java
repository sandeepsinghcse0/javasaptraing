package com.sapient.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AddEmployee {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url, "system", "sapient");
		String sql = "insert into employee values(?,?,?,?,?)";
		PreparedStatement st = conn.prepareStatement(sql);
		st.setInt(1, 2110);
		st.setString(2, "Abhishek");
		st.setInt(3, 200000);
		st.setInt(4, 2);
		st.setString(5, "12-dec-2016");
		int rows=st.executeUpdate();
        System.out.println(rows);
        conn.close();
	}

}
