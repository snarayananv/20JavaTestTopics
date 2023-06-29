package org.java;

public class Employee {

	public void Search() throws EmployeeNotFoundException {

		throw new EmployeeNotFoundException();

	}
	
	public static void main(String[] args) throws EmployeeNotFoundException {
		
		Employee e = new Employee();
		e.Search();
		
	}
}
