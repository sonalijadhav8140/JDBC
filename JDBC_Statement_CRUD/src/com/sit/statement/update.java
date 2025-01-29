package com.sit.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class update {
	
   
		
    	public static void main(String[] args) throws ClassNotFoundException {
    		// Step 1:Load the driver class
    		
    		
    		try {

    			Class.forName("com.mysql.cj.jdbc.Driver");
    			
    			//Step 2:Eshtablish JDBC Connection
    			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
    			
    			//step 3:create sql query
    			String sql="update Student set name='Sonali' where id=101";
    			//create sql statement object
    			Statement smt=con.createStatement();
    			
    			//submit sql query
    			
    			int update=smt.executeUpdate(sql);
    			
    			//close resources
    			con.close();
    			smt.close();
    			System.out.println("updated data "+update);
    		} catch (SQLException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		
    	
    	
    	
	}
}

