package com.test;

import java.util.List;

public class Employee {
	private int empid;
	private String employeeName;
	private String designation;
	private float salary;
	private boolean married;
	private List<String> vehicleDetails;
	private PrevCompanyDetails prevcompanyDetails;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public List<String> getVehicleDetails() {
		return vehicleDetails;
	}

	public void setVehicleDetails(List<String> vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	public PrevCompanyDetails getPrevcompanyDetails() {
		return prevcompanyDetails;
	}

	public void setPrevcompanyDetails(PrevCompanyDetails prevcompanyDetails) {
		this.prevcompanyDetails = prevcompanyDetails;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", employeeName=" + employeeName + ", designation=" + designation
				+ ", salary=" + salary + ", married=" + married + ", vehicleDetails=" + vehicleDetails
				+ ", prevcompanyDetails=" + prevcompanyDetails + "]";
	}

}
