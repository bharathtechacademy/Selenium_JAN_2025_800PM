package com.creatio.crm.language.basics;

public class MethodConcepts4 {
	int empId;

	MethodConcepts4(int id) {
		empId = id;
	}

	MethodConcepts4() {
		
	}

	public void printEmpDetails(String name) {
		System.out.println(empId);
		System.out.println(name);
	}

	public void printEmpAddress(String Address) {
		System.out.println(empId);
		System.out.println(Address);
	}

	public void printEmpVisaDetails(String visaNumber) {
		System.out.println(empId);
		System.out.println(visaNumber);
	}

	public void printEmpStayDetails(String HotelName) {
		System.out.println(HotelName);
	}

}
