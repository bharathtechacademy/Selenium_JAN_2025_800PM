package com.creatio.crm.language.basics;

public class MethodConcepts2 {

	public static void main(String[] args) {
		
		

		MethodConcepts2 obj = new MethodConcepts2();

		obj.launchTheBrowser("chrome","www.google.com");
		obj.loginIntoTheApplication();
		System.out.println("Execute Test Case 1 Steps Related to HomePage....");
		obj.logoutAndCloseTheBrowser();

		obj.launchTheBrowser("firefox","www.yahoo.com");
		obj.loginIntoTheApplication();
		System.out.println("Execute Test Case 2 Steps Related to Fund Transfer Page....");
		obj.logoutAndCloseTheBrowser();

		obj.launchTheBrowser("edge","www.yahoo.com");
		obj.loginIntoTheApplication();
		System.out.println("Execute Test Case 3 Steps Related to Login Page....");
		obj.logoutAndCloseTheBrowser();
		;

		obj.launchTheBrowser("chrome","www.yahoo.com");
		obj.loginIntoTheApplication();
		System.out.println("Execute Test Case 3 Steps Related to Login Page....");
		obj.logoutAndCloseTheBrowser();

		obj.launchTheBrowser("firefox","www.google.com");
		obj.loginIntoTheApplication();
		System.out.println("Execute Test Case 4 Steps Related to Check the balance Page....");
		System.out.println(obj.getBalance());
		obj.logoutAndCloseTheBrowser();

	}

	//method with arguments
	public void launchTheBrowser(String browser,String url) {
		System.out.println("Launch the "+browser+" browser");
		System.out.println("Enter url "+url+" and launch application");
	}

	//method without arguments
	void loginIntoTheApplication() {
		System.out.println("Enter username as Bharath");
		System.out.println("Enter password as bharath123");
		System.out.println("Click on Login button");
	}

	// method without return type
	void logoutAndCloseTheBrowser() {
		System.out.println("Logout from application");
		System.out.println("Close the browser");
	}

	// method with return type
	double getBalance() {
		System.out.println("Navigate to account section");
		System.out.println("Capture the Account balance");
		double balance = 1000.50;
		return balance;
	}
	
	//default constructor
	MethodConcepts2(){
		
	}
	
	//parameterized constructor
	MethodConcepts2(String name){
		
	}


}
