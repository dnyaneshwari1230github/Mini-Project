package com.velocity_miniproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest 
{
	Connection connection = null;  
	//to create connection
	
	public Connection getConnectionDetails() throws ClassNotFoundException 
	{ //utility
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz_schema","root","Dnyanu@1230");
			
		}catch(SQLException e)
		{
			e.printStackTrace();
			
		}
		
		return connection;
		
	}
	 
}
