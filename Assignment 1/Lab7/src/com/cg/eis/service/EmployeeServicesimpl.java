package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class EmployeeServicesimpl implements EmployeeServices {

	@Override
	public String getInsurance(Employee emp) {
		String insurance = "";
		if (emp.getSalary() > 5000 && emp.getSalary()<20000 && emp.getDesignation()=="System Associate") {
			insurance = "Scheme C";
		
		}
		else if (emp.getSalary() >=20000 && emp.getSalary()<40000 && emp.getDesignation()=="Programmer") {
			insurance = "Scheme B";
		
		}
		else if (emp.getSalary() >=40000  && emp.getDesignation()=="Manager") {
			insurance = "Scheme A";
		
		}
		else if (emp.getSalary() < 5000 && emp.getDesignation()=="Clerk") {
			insurance = "No Scheme";
		
		}
		return insurance;
	}

	
}


