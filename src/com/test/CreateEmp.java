package com.test;

import java.util.ArrayList;
import java.util.List;

public class CreateEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		emp1.setEmpid(123);
		emp1.setEmployeeName("vinoth");
		emp1.setDesignation("test engineer");
		emp1.setSalary(15000);
		emp1.setMarried(false);
		List<String> vehicleDetailsemp1 = new ArrayList<String>();
		vehicleDetailsemp1.add("car");
		vehicleDetailsemp1.add("bike");
		emp1.setVehicleDetails(vehicleDetailsemp1);
		PrevCompanyDetails precompemp1 = new PrevCompanyDetails();
		precompemp1.setPrevCompanyName("xyz");
		precompemp1.setPrecompSalary(10000);
		emp1.setPrevcompanyDetails(precompemp1);
		System.out.println(emp1);

	}

}
