package com.elsowiny.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
//TO TEST THE JDBC CONNECTION
	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/colorvoteschema";
		
	//	String jdbcUrl = "jdbc:mysql://localhost:3306/colorvoteschema?useSSL=false";
		String user = "colorvoter";
		String pass = "pass";
		try {
			
			System.out.println("Connecting to database: " + jdbcUrl);
			
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			
			System.out.println("Connection succesful!!");
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
		
		

	}

}
