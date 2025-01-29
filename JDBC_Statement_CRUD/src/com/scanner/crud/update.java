package com.scanner.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class update {
	
	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		//Step 1:load driver class
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 2:Eshtablish JDBC conenction
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","root");
			
			//step 3:sql query
			System.out.println("Enter id where you wannaa update value");
			int id1=sc.nextInt();
			
			System.out.println("Enter Value to update");
			String name=sc.next();
			
			
			
			String sql="update Student set name='"+name+"'where id= "+id1  ;
			
			//step 4: create object of the statement
			Statement smt=con.createStatement();
			
			//step 5:execute the query
			int update=smt.executeUpdate(sql);
			
			if(update>0) {
				System.out.println("updated Successfully");
			}
			
			else {
				System.out.println("Id not present");
			}
			
			//step 6:close resources 
			smt.close();
			con.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
