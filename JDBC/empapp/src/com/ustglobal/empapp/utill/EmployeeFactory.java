package com.ustglobal.empapp.utill;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;

public class EmployeeFactory {
	
	private EmployeeFactory() {}//since no need of creating 
	
	public static EmployeeDAO getEmployeeDAO(){
		return new EmployeeDAOImpl();
	}
}
