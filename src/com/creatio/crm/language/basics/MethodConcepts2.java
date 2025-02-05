package com.creatio.crm.language.basics;

public class MethodConcepts2 {
	
	

	public static void main(String[] args) {
		
		MethodConcepts2 obj = new MethodConcepts2();
		
		obj.launchTheBrowser();
		obj.loginIntoTheApplication();		
		System.out.println("Execute Test Case 1 Steps Related to HomePage....");		
		obj.logoutAndCloseTheBrowser();

		obj.launchTheBrowser();
		obj.loginIntoTheApplication();			
		System.out.println("Execute Test Case 2 Steps Related to Fund Transfer Page....");		
		obj.logoutAndCloseTheBrowser();

		obj.launchTheBrowser();
		obj.loginIntoTheApplication();			
		System.out.println("Execute Test Case 3 Steps Related to Login Page....");		
		obj.logoutAndCloseTheBrowser();;

		obj.launchTheBrowser();
		obj.loginIntoTheApplication();			
		System.out.println("Execute Test Case 3 Steps Related to Login Page....");		
		obj.logoutAndCloseTheBrowser();

	}
	
	 void launchTheBrowser(){
		System.out.println("Launch the firefox browser");
		System.out.println("Enter url and launch application");		
	}
	
	void loginIntoTheApplication(){
		System.out.println("Enter username as Bharath");
		System.out.println("Enter password as bharath123");
		System.out.println("Click on Login button");
	}
	
	void logoutAndCloseTheBrowser(){
		System.out.println("Logout from application");
		System.out.println("Close the browser");
	}
	
	

}
