package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcConnection {
	public static void main(String[] args) {
		Connection con = null;
		try {
			// load the driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// connect to database
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "admin");
			// write sql query
			String sql = "Select * from employees";
			// prepare statement
			PreparedStatement ps = con.prepareStatement(sql);
			// execute query
			ResultSet res = ps.executeQuery();
			// iterate the results
			while (res.next()) {
				int empId = res.getInt("id");
				String name = res.getString("name");
				String email = res.getString("emailId");
				long phone = res.getLong("phone");
				System.out.println(empId);
				System.out.println(name);
				System.out.println(email);
				System.out.println(phone);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
