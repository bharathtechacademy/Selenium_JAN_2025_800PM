package com.creatio.crm.language.basics;

public class JumpingStatements {
	
	//break; ==> break the loop
	//continue ==> skip current iteration only 
	//return

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			
			if(i>4 && i<8) {
//				break;
				continue;
			}
			
			System.out.println(i);
		}

	}

}
