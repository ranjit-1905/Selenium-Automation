package com.javacore.constructors;

public class Employee {
	
	String employeeName;
	int employeeID;
	
	//define a no arg Constructor
	
	Employee(){
		        employeeID = 1;
				 employeeName = "ranjith";
		System.out.println("Employee name has been Created");
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee Emp= new Employee();
		 
	}
}
