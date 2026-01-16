package com.constructor;

public class Office {
	 public static void main(String[] args) {
		    Employee emp1 = new Employee();
	        Employee emp = new Employee(101, "Sneha Patil", 55000.75);
	        
	        
	        System.out.println(emp1.name);
	        
	        
	        System.out.println("Employee ID   : "+emp.id);
	        System.out.println("Employee Name : "+emp.name);
	        System.out.println("Employee Salary : "+emp.salary);
	    }
	}


