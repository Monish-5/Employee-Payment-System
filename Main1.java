package org.carproject;

public class Main1 {
	
	    public static void main(String[] args) {
	        PayrollSystem payrollSystem = new PayrollSystem();

	        FullTimeEmployee emp1 = new FullTimeEmployee("Monish", 101, 5000.0);
	        FullTimeEmployee emp2 = new FullTimeEmployee("Akask ", 103, 15000.0);
	        PartTimeEmployee emp3= new PartTimeEmployee(" Smith", 102, 30, 15.0);

	        payrollSystem.addEmployee(emp1);
	        payrollSystem.addEmployee(emp2);
	        payrollSystem.addEmployee(emp3);

	        System.out.println("Initial Employee Details:");
	        payrollSystem.displayEmployees();

	        System.out.println("\nRemoving Employee...");
	        payrollSystem.removeEmployee(101);

	        System.out.println("\nRemaining Employee Details:");
	        payrollSystem.displayEmployees();
	    }
	}


