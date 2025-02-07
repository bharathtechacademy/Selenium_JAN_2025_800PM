package com.creatio.crm.language.basics;

public class MethodConcepts3 {

	public static void main(String[] args) {

		int[] empIds = { 1234, 1235, 1236 };

		for (int empId : empIds) {
			MethodConcepts4 obj = new MethodConcepts4(empId);
			obj.printEmpDetails("Venu");
			obj.printEmpAddress("Hyderabad");
			obj.printEmpVisaDetails("USDG6543G");
			obj.printEmpStayDetails("Lemon Tree");
		}

//		MethodConcepts4 obj = new MethodConcepts4(1234);
//		obj.printEmpDetails("Venu");
//		obj.printEmpAddress("Hyderabad");
//		obj.printEmpVisaDetails("USDG6543G");
//		obj.printEmpStayDetails("Lemon Tree");
	}

}
