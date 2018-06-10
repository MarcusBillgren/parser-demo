package com.billgren.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.billgren.bean.ClinicTest;


public class DatabaseConncector {
	
	private Connection connection;
	
	private String user;
	private String password;
	private String path = "jdbc:postgresql://localhost:5432/clinic";

	public DatabaseConncector(String user, String password) {
		this.user = user;
		this.password = password;
	}
	
	public void connectToDB() {
		try {
			DriverManager.registerDriver(new org.postgresql.Driver());
			 //connect to db
			 DriverManager.getConnection(path, user, password); 
			 System.out.println("Connected to database");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public boolean addResult(ClinicTest test) {
		return false;
	}
	
	public boolean addResult(List<ClinicTest> test) {
		return false;
	}
	
	public void closeConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	

}
