package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.mysql.jdbc.Driver;

public class ExecuteInsertPreparedStatement {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {

			//Step1 load the driver
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			//step2 Get the connection
			String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=1234";
			conn = DriverManager.getConnection(url);

			//Step 3 Issue Sql query
			String sql = " insert into employee_info "
					+ " values(?,?,?,?) ";
			pstmt = conn.prepareStatement(sql);

			String empid = args[0];
			int id = Integer.parseInt(empid);
			pstmt.setInt(1, id);

			String name = args[1];
			pstmt.setString(2, name);

			String empsal = args[2];
			int sal = Integer.parseInt(empsal);
			pstmt.setInt(3, sal);

			String gender = args[3];
			pstmt.setString(4, gender);

			int count = pstmt.executeUpdate();


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
				if(pstmt != null)
				{
					pstmt.close();
				}

			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
