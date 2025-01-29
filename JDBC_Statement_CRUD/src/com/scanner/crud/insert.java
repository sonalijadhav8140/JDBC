package com.scanner.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class insert {

	public static void main(String[] args) throws ClassNotFoundException {

		// Step 1:Load the driver class
		Scanner sc = new Scanner(System.in);

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			// Step 2:Eshtablish JDBC Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "root");

			// step 3:create sql query

			System.out.println("Enter how many records you wanan add");
			int cnt = sc.nextInt();

			int id1 = 0;
			String name1 = null;
			String email1 = null;
			String sql = null;
			Statement smt = null;
			for (int i = 0; i < cnt; i++) {

				System.out.println("Enter Id");
				id1 = sc.nextInt();
				System.out.println("Enter Name");
				name1 = sc.next();
				System.out.println("Enter Email");
				email1 = sc.next();

				sql = "insert into Student(id,name,email) values (" + id1 + ",'" + name1 + "','" + email1 + "')";
				// create sql statement object
				smt = con.createStatement();

				// submit sql query

				smt.execute(sql);

			}

			// close resources
			con.close();
			smt.close();
			System.out.println("Records added successfully..");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
