package com.creatio.crm.language.basics;

//child extends parent

public class ClassesAndObject3 extends ClassesAndObject1{
	
	String [] address = {"Chennai", "Tamilnadu"};
	
	public static void main(String[] args) {

		ClassesAndObject3 obj = new ClassesAndObject3();
		System.out.println(obj.empName);
		System.out.println(obj.empId);
	}

}
