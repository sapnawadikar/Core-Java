package com.constructor;

public class Employee {
	int id;
    String name;
    double salary;
    
    public Employee(int id,String name, double salary) {
    	this.id = id;
		this.name = name;
		this.salary = salary;
	}
   public Employee() {
    	 id = 0;
         name = "Unknown";
         salary = 0.0;
    }

	}
    
    
    
