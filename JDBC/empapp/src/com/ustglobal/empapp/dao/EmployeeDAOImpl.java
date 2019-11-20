package com.ustglobal.empapp.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dto.EmployeeBean;

public class EmployeeDAOImpl implements EmployeeDAO{

	public List<EmployeeBean> getAllEmployeeData() {
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=1234";
		String sql = "select * from employee_info";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			ArrayList<EmployeeBean> result = new ArrayList<EmployeeBean>() ;
			while(rs.next()) {
				/*
				 * System.out.println("Id :"+ rs.getInt("id")); System.out.println("Name :"+
				 * rs.getString("name")); System.out.println("Salary:"+ rs.getInt("sal"));
				 * System.out.println("Gender :"+ rs.getString("gender"));
				 * System.out.println("**********************************");
				 */

				EmployeeBean bean = new EmployeeBean();

				int id = rs.getInt("id");
				bean.setId(id);

				String name = rs.getString("name");
				bean.setName(name);

				int sal = rs.getInt("sal");
				bean.setSal(sal);

				String gender = rs.getString("gender");
				bean.setGender(gender);;

				result.add(bean);

			}
			return result;

		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

	}



	public EmployeeBean searchEmployeeData(int id) {
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=1234";
		String sql = "select * from employee_info where id=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();

			if(rs.next()) {
				EmployeeBean bean = new EmployeeBean();


				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setSal(rs.getInt("sal"));
				bean.setGender(rs.getString("id"));
				return bean;
			}
			else {
				return null;
			}




		}catch(Exception e){
			e.printStackTrace();
			return null;

		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(rs!=null) {
					rs.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

	}



	@Override
	public int insertEmployeeData(EmployeeBean bean) {
		String url = "jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=1234";

		String sql = "insert into employee_info values(?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;


		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url);
			int employeeId=0,empsal=0;
			String empName ="",empGender="";
			pstmt = conn.prepareStatement(sql);
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter no of employees");
			int noOfEMployee = sc.nextInt();
			for(int i = 0; i<noOfEMployee ; i++) {
				System.out.println("Enter Employee Id   :");
				employeeId = sc.nextInt();
				System.out.println("Enter Employee name :");
				 empName = sc.next();
				System.out.println("Enter Employee sal  :");
				empsal = sc.nextInt();
				System.out.println("Enter Gender        :");
				empGender= sc.next();
			}
				
				
				pstmt.setInt(1, employeeId);
				pstmt.setString(2, empName);
				pstmt.setInt(3, empsal);
				pstmt.setString(4, empGender);			

				int count = pstmt.executeUpdate();

				if(count>0) {

					return count;
				}





			}catch(Exception e){
				e.printStackTrace();
				
			}finally {
				try {
					if(conn!=null) {
						conn.close();
					}
					if(pstmt!=null) {
						pstmt.close();
					}
					
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
			return 0;
		}



		@Override
		public int updateEmployeeData(EmployeeBean bean) {
			// TODO Auto-generated method stub
			return 0;
		}



		@Override
		public int deleteEmployeeData(EmployeeBean bean) {
			// TODO Auto-generated method stub
			return 0;
		}	

	}
