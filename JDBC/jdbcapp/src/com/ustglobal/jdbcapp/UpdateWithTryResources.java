package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class UpdateWithTryResources {
	public static void main(String[] args) {
		try(FileReader reader = new FileReader("db.properties")) {
			Properties prop = new Properties();
			prop.load(reader);

			//Step 1 :load the driver
			Class.forName(prop.getProperty("driver-class-name"));

			String url = prop.getProperty("url");
			String sql = prop.getProperty("update-query");
			try(Connection conn= DriverManager.getConnection(url,prop)){
				PreparedStatement pstmt = conn.prepareStatement(sql);

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


				//Step 4 Read the result
				System.out.println(count);
				System.out.println(count + "Row(s) Inserted");
			}
		} catch (Exception e) {

		}
	}
}
