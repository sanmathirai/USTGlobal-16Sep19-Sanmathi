package com.ustglobal.empapp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;

public class DynamicUpdateQuery {
public static void main(String[] args) {
	String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=1234";
	//dynamic query
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	
	
	
	try {
		Driver driver = new Driver();
		DriverManager.deregisterDriver(driver);
		
		conn = DriverManager.getConnection(url);
		
		String sql = "update employee_info set name=?, sal=?,gender=? where id=?";
		pstmt = conn.prepareStatement(sql);

		String empid = args[0];
		int id = Integer.parseInt(empid);
		pstmt.setInt(4, id);

		String name = args[1];
		pstmt.setString(1, name);

		String empsal = args[2];
		int sal = Integer.parseInt(empsal);
		pstmt.setInt(2, sal);

		String gender = args[3];
		pstmt.setString(3, gender);
		
	
		
		int count = pstmt.executeUpdate();
		System.out.println(count);
		
		
		
			
		
	}	catch(SQLException e)
	{
		e.printStackTrace();
	}
	finally {
		try {
			if(conn!=null)
			{
				conn.close();
			}
			if(pstmt!=null)
			{
				pstmt.close();
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
}
}
}
