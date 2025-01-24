package com.creatio.crm.language.basics;

public class DebugProgram {
	
	// First line of the Error :  What is the exception that caused program failure along with the details of source code with detailed explanation
	
	// Last Line of the Error : In which line program is failed along with hyperlink

	public static void main(String[] args) {
		
		System.out.println("Execution is Started");
		int i = 20;		
		int j = 5;
		j+=5;
		System.out.println(i/(j-10));
		System.out.println("Execution is Completed");
	}

}
