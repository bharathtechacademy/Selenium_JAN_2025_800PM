package com.creatio.crm.language.basics;

public class DocumentationComments {

	public static void main(String[] args) {
		
		System.out.println(calculateInterest(100000, 9.0, 24));

	}

	/**
	 * 
	 * This is the common function to provide the total interest amount 
	 * based on the loan amount, interest rate along with duration in month
	 * 
	 * @param amount (total loan amount)
	 * @param interest (interest rate per year)
	 * @param months (total duration of the loan in month)
	 * 
	 * @return interest amount for specific duration
	 * 
	 * @author Bharath (BharathTechAcademy@gmail.com)
	 * @version 1.0
	 * @throws InterruptedException 
	 * @throws NullPointerException
	 * @deprecated  new version is available, this function is deprecated
	 * 
	 * Execute this logic in main method {@link #calculateInterest(100000, 9.0, 24)}
	 * 
	 */
	
	public static double calculateInterest(int amount , double interest, int months) {
		double intrst = (amount * months * interest /100)/12 ;
		return intrst;
	}
	
}
