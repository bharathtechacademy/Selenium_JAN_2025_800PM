package com.creatio.crm.language.basics;

import java.util.logging.Logger;

public class HelloWorld {

	public static void main(String[] args) {		
		
		// Print the data and go to next line
		System.out.println("Hello, World!");
		
		// Print the data and stay on same line
		System.out.print("Hello, ");
		System.out.print("World");
		System.out.println();
		
		// Print the statements with specific format 
		System.out.printf("My Name is %s and My Age is %d and My visa status is %b. %n","Darsan",32,true);
		
		// Print the statement with explicit format for digits
		System.out.format("Pi values is approx %.2f",3.1415967);
		System.out.println();
			
		// Print the error messages 
		System.err.println("Getting Error in Line 29");
		
		// Print the logs along with time stamp
		Logger.getLogger("MyLogger").info("Currently I'm in line 24, Program is executing well");
		Logger.getLogger("MyLogger").warning("Currently I'm in line 25, Consider it's a Warning");
		
		
	}

}
