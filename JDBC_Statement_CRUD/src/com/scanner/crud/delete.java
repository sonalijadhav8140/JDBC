package com.scanner.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class delete {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		try {
			// step 1:load driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step 2:Eshtablish JDBc connection

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "root");

			System.out.println("Enter id of record you wanna delete ");
			int id1 = sc.nextInt();

			// step 3:create sql query
			String sql = "delete from Student where id=" + id1;

			// step 4:create object of statement

			Statement smt = con.createStatement();

			// step 5:execute query

			int delet = smt.executeUpdate(sql);

			if (delet > 0) {
				System.out.println("Deleted Record successfully " + id1);
			}

			else {
				System.out.println("Record " + id1 + " Not Present");
			}

			// step 6:close all resources
			smt.close();
			con.close();

			System.out.println("Record deleted");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
