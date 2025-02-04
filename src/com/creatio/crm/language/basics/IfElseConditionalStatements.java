package com.creatio.crm.language.basics;

public class IfElseConditionalStatements {

//	if(condition) {
//		
//	}else if(condition) {
//		
//	}else {
//		
//	}

	public static void main(String[] args) {

		int age = 18;
		if (age >= 18) {
			System.out.println("Person is Eligible to Vote");
		} else {
			System.out.println("Person is Not Eligible to Vote");
		}

		int input = 1;

		if (input > 0) {
			System.out.println("It is Positive Number");
		} else if (input < 0) {
			System.out.println("It is Negative Number");
		} else {
			System.out.println("It is Zero");
		}

		double percentage = 72.3;

		if (percentage >= 60) {
			System.out.println("You got First Class");
			if (percentage >= 90) {
				System.out.println("Hey , You are eligible for Gold Medal");
			} else {
				System.out.println("But , You are not eligible for Gold Medal");
			}
		} else if (percentage >= 50 && percentage < 60) {
			System.out.println("You got Second Class");
		} else if (percentage >= 40 && percentage < 50) {
			System.out.println("You got Third Class");
		} else {
			System.out.println("Sorry, You Failed Bro");
		}

	}

}
