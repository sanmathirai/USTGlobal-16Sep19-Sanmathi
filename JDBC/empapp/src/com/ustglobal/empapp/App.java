package com.ustglobal.empapp;


import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.utill.EmployeeFactory;

public class App {
	public static void main(String[] args) {
		while(true) {
			System.out.println("Press 1 to show all data");
			System.out.println("Press 2 to insert all data");
			System.out.println("Press 3 to update all data");
			System.out.println("Press 4 to delete all data");
			System.out.println("Press 5 to search all data");

			Scanner sc = new Scanner(System.in);
			int ch = sc.nextInt();

			switch (ch) {

			case 1:

				EmployeeDAO dao = EmployeeFactory.getEmployeeDAO();
				List<EmployeeBean> result = dao.getAllEmployeeData();

				System.out.println("******Employee Details********");
				for(EmployeeBean bean :result) {

					System.out.println("Employee Id   :" + bean.getId());
					System.out.println("Employee name :" + bean.getName());
					System.out.println("Employee sal  :" + bean.getSal());
					System.out.println("Gender        :" + bean.getGender());
					System.out.println("******************************");
				}
				break;

			case 2:
				EmployeeBean bean1 = new EmployeeBean();
				EmployeeDAO dao2 = EmployeeFactory.getEmployeeDAO();

				int count = dao2.insertEmployeeData(bean1);
				System.out.println(count);
				break;

			case 3:
				break;

			case 4:
				break;

			case 5:
				EmployeeDAO dao5 = EmployeeFactory.getEmployeeDAO();
				System.out.println("Enter id to be searched :");

				int id = sc.nextInt();
				EmployeeBean bean = dao5.searchEmployeeData(id);

				if(bean != null)
				{
					System.out.println("******Employee Details********");
					System.out.println("Employee Id   :" + bean.getId());
					System.out.println("Employee name :" + bean.getName());
					System.out.println("Employee sal  :" + bean.getSal());
					System.out.println("Gender        :" + bean.getGender());
					System.out.println("******************************");
				}else {
					System.out.println("Sorry :( No data found\n");
				}

			default:
				break;
			}
		}

	}
}
