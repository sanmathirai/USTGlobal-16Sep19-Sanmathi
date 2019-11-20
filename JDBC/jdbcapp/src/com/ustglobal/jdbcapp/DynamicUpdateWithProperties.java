package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Driver;

public class DynamicUpdateWithProperties {
public static void main(String[] args) {
	Connection conn = null;
	PreparedStatement pstmt = null;
	FileReader reader = null;

	try {

		//Step1 load the driver
		reader = new FileReader("db.properties");
		Properties prop = new Properties();
		prop.load(reader);
		
		//Step 1 :load the driver
		Class.forName(prop.getProperty("driver-class-name"));
		
		String url = prop.getProperty("url");
		conn = DriverManager.getConnection(url,prop);

		//Step 3 Issue Sql query
		String sql = prop.getProperty("update-query");
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
		
		
		
			
		
	}	catch(Exception e)
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
			if(reader != null)
			{
				reader.close();
			}

			
		}catch(Exception e) {
			e.printStackTrace();
		}
}
}
}
