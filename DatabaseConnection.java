package com.spring.foobar.demo.util;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component
public class DatabaseConnection {
	private Connection connection =null;
	
	DatabaseConnection(
			@Value("${db.url}")String url,
			@Value("${db.username}")String username,
			@Value("${db.password") String password
		) throws SQLException{
		super();
		this.connection=DriverManager.getConnection(url,username,password);
		printConnectionDetails();
	}
	
	@PostMapping
	public void init() throws SQLException {
		printConnectionDetails();
	}

	@SuppressWarnings("unused")
	private void printConnectionDetails()throws SQLException{
		System.out.println("Connected to database server"+ this.connection.getMetaData().getDatabaseProductName()+"version:"
				
				+ this.getMetaData().getDatabaseProductVersion()+ "/n");
	}

	public Connection getConnection() {
		return connection;
	}
	
	
}



