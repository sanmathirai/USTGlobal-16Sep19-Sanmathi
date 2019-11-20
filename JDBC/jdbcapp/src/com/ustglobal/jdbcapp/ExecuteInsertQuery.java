package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;

		try {

			//Step1 load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//step2 Get the connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=1234";
			conn = DriverManager.getConnection(url);

			//Step 3 Issue Sql query
			String sql =" insert into employee_info "
					+ " values(7,'sanma Rai',56222,'F') ";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);

			//Step 4 Read the result
			System.out.println(count);
			System.out.println(count + "Row(s) Inserted");

		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		//Step5 close all JDBC Connection
		finally {
			try {
				if(conn != null)
				{
					conn.close();
				}
				if(stmt != null)
				{
					stmt.close();
				}

			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}//end of main
}//end of ExecuteInsertQuery
