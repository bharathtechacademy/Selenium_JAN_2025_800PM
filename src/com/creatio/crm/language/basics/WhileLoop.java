package com.creatio.crm.language.basics;

public class WhileLoop {

//	while(condition) {
//		Statements
//	}

	public static void main(String[] args) {

		int i = 1;

		while (i > 0) {
			if (i > 100) {
				break;
			}
			System.out.println("Refresh the Page");
			i++;
		}

	}

}
