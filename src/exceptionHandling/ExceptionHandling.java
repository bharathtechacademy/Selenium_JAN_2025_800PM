package exceptionHandling;

public class ExceptionHandling {
	
	//Error vs Exception
	
	// Error is an issue that occurs during run time and we cannot control the same.
	// Exception is an issue that occurs due to logical error and we can control the same.

	
	//Error example : StackOverFlowError	
	public static void method1() {
		method1();
	}
	
	//Exception Example : NullPointerException, ArrayIndexOutOfBoundsException
	
	//ExceptionHandling ==> Handle the exceptions / controlling the exceptions
	
	// throws declaration ==> when we know the exception details before itself
	// try/catch exception handling ==> when we are not sure about exception
	// throw an customized exception
	
	public static void main(String[] args) {
		method1();
	}

}
