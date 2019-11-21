package com.ustglobal.collectionframework.list.assignment;

public class Employee {
	/*
	 * byte age ; short id;
	 */
	int mobNo;
	long adharNo;
	float pf;
	double salary;
	boolean isMarried;
	char blockNo;
	public Employee(int mobNo, long adharNo, float pf, double salary, boolean isMarried,
			char blockNo) {
		super();
		/*
		 * this.age = age; this.id = id;
		 */
		this.mobNo = mobNo;
		this.adharNo = adharNo;
		this.pf = pf;
		this.salary = salary;
		this.isMarried = isMarried;
		this.blockNo = blockNo;
	}
	@Override
	public String toString() {
		return "mobNo=" + mobNo + ", adharNo=" + adharNo + ", pf=" + pf
				+ ", salary=" + salary + ", isMarried=" + isMarried + ", blockNo=" + blockNo + "\n";
	}
	
	
	
	

}
