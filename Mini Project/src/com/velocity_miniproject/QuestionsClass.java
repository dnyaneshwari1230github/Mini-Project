package com.velocity_miniproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashSet;

public class QuestionsClass 
{
	static Connection connection = null;
	PreparedStatement pstmt = null;
		

		
	try 
	{
		//creating object of ConnectionTest class to call its method
		ConnectionTest connectionTest = new ConnectionTest();
		
		connection = connectionTest.getConnectionDetails();
		
		PreparedStatement pstmt = connection.prepareStatement("Select*from question");
		
		ResultSet rs = pstmt.executeQuery();  //step 5 = to submit sql statement
		
		//step 6= to retrieve the data and to iterate in the loop we use while loop here 
		
		while (rs.next())
		{
			System.out.println("Question Number : " +rs.getInt(1));
			
			System.out.println("Question is : " +rs.getString(2));
			
			System.out.println("Option 1 is : " +rs.getString(3));

			System.out.println("Option 2 is : " +rs.getString(4));

			System.out.println("Option 3 is : " +rs.getString(5));

			System.out.println("Option 4 is : " +rs.getString(6));
			
			//store the question in hashset
			
			HashSet <String> hs = new HashSet <String> ();
			
			hs.add(rs.getString(2));
			
			System.out.println(hs);
			
			//getAnswer();
			
		}
		connection.close();
		pstmt.close();
		rs.close();
			
	}
	
	catch(Exception e)
	{
		System.out.println(e);
		
	}
	
}
}

public static void main(String[] args) {
	
	
	
}