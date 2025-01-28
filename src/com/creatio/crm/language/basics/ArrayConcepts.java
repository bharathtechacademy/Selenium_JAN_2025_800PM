package com.creatio.crm.language.basics;

public class ArrayConcepts {

	public static void main(String[] args) {

		// Arrays ==> Data type can store multiple values with similar data type together at one place
		
		// Syntax to initialize array : DataType [] Variable = new DataType [Length/size];
		// Syntax to Store value in array : DataType [Index] = Value;
		// Syntax to retrieve value in array : DataType [Index] ;
		// Syntax to check total values in array : Variable.length;

		// direct initialization method.
		String [] names = { "Bharath", "ABC", "XYZ" };

		// declaration with size method.
		String[] empNames = new String[3];
		empNames[0] = "Bharath";
		empNames[1] = "ABC";
		empNames[2] = "XYZ";
		//empNames[3] = "CDF"; //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		
		// Access data
		System.out.println(empNames[0]);
		System.out.println(empNames.length);


		// 2D - Array

		/*
		 * 2D array is essentially an "array of arrays." It can be visualized as a table
		 * or a matrix with rows and columns.
		 */

		// Imagine a scenario where we store the details of employees: Employee ID,
		// Name, and Department.
		String[][] employees = { { "101", "Alice", "HR" }, { "102", "Bob", "IT" }, { "103", "Charlie", "Finance" } };

		// Accessing elements
		System.out.println("Employee ID: " + employees[0][0]);

		// 3D array is an "array of 2D arrays." It can be visualized as a collection of
		// matrices or a 3D grid.

		// Assume a company with offices in two locations. Each location has its own
		// list of employees, and we want to store Employee ID, Name, and Department for
		// each location.
		String[][][] company = { { { "101", "Alice", "HR" }, { "102", "Bob", "IT" } },
				{ { "201", "David", "Finance" }, { "202", "Eva", "Marketing" } } };
		// Accessing elements
		System.out.println("Location 1, Employee Name: " + company[0][0][1]);
		
		int [] ids = new int [3];

	}

}
