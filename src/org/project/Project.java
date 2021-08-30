package org.project;

import org.client.Employee;
import org.company.Company;
import org.emp.Client;

public class Project {
	private void projectName() {
		System.out.println("order");

	}
public static void main(String[] args) {
	
	Project p= new Project();
	p.projectName();
		
	Employee e =new Employee();
	e.empName();
	Company c = new Company(); 
	c.companyName();
	Client y=  new Client();
	y.clientName();
	
	
	
	}
}
