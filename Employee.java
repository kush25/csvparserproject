package com.hcl.csvparser;

public class Employee {
	
	private String empName;
	private int empId;
	private String empPhone;
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}
	public Employee(int empId, String empName, String empPhone) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empPhone = empPhone;
	}
	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empPhone=" + empPhone + "]";
	}

}
