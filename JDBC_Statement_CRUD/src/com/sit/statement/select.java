package com.sit.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class select {
       

	
	public static void main(String[] args) throws ClassNotFoundException {
		// Step 1:Load the driver class
		
		
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step 2:Eshtablish JDBC Connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
			
			//step 3:create sql query
			String sql="select * from Student";
			//create sql statement object
			Statement smt=con.createStatement();
			
			//submit sql query
			//result set is used to get the data and store it in resultset
			
			ResultSet rs=smt.executeQuery(sql);
			  while(rs.next()) {
				  System.out.print(rs.getInt(1)+" ");
				  System.out.print(rs.getString(2)+" ");
				  System.out.print(rs.getString(3));
			  }
			//close resources
			con.close();
			smt.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	
	
}

}
