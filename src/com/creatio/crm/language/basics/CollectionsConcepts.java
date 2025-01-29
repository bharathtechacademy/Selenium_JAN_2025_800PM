package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsConcepts {
	
	
	//Challenges with Arrays
	
	// 1. Arrays are fixed in size
	// 2. Memory will be allocated at the beginning of creating array / static memory allocation
	// 3. Array allows similar data types only
	// 4. Modifications also not allowed
	
	
	// Collections Framework
	
	
	// List ==> ArrayList, LinkedList
	
	// 1. List can store multiple values with similar data type together at one place by allocating memory dynamically
	// 2. List can follow dynamic memory allocation
	// 3. List allows modifications
	// 4. List allows duplicate values
	
	// Set ==> HashSet, LinkedHashSet, TreeSet
	
	// 1. Set can store multiple values with similar data type together at one place by allocating memory dynamically
	// 2. Set can follow dynamic memory allocation
	// 3. Set allows modifications
	// 4. Set won't allow duplicate values
	
	// Map ==> HashMap, LinkedHashMap, TreeMap, Hashtable
	
	// 1. Map can store multiple values with different data types in the form of Key and Value
	// 2. Map can follow dynamic memory allocation
	// 3. Map allows modifications
	// 4. Map won't allow duplicate keys but it allows duplicate values
	 

	public static void main(String[] args) {
		
		//Level 1
		String empName1 = "Bharath";
		int empId1=1234;
		
		String empName2 = "ABC";
		int empId2=1235;
		
		//Level 2
		String[] empNames = new String[3];
		empNames[0] = "Bharath";
		empNames[1] = "Dhilip";
		empNames[2] = "Alekya";
//		empNames[3] = "Aarika";
		
		int [] empIds = new int [3];
		empIds[0]=1234;
		empIds[1]=1235;
		empIds[2]=1236;
		
		/**********************ArrayList*******************/
		System.out.println("********************ArrayList*************************");
		
		//Syntax to Initialize: List<DataType> variable = new ArrayList<DataType>();
		//Syntax to add data: variable.add(value);
		//Syntax to get the data: variable.get(index);
		//Syntax to remove the data:variable.remove(value);
		//Syntax to get the total value : variable.size();
		
		// Order of Storing values:
		// Null Values:
		// Memory allocation:
		
		List<String> empNamesArrayList = new ArrayList<String>();
		empNamesArrayList.add("Bharath");
		empNamesArrayList.add("Dhilip");
		empNamesArrayList.add("Alekya");
		empNamesArrayList.add("Aarika");
		empNamesArrayList.add("Bharath");
		empNamesArrayList.add(null);
		empNamesArrayList.remove("Alekya");
		empNamesArrayList.add(1,"Swapnil");		
		System.out.println("ArrayList Size is : "+empNamesArrayList.size());
		System.out.println(empNamesArrayList);
		
		/**********************LinkedList*******************/
		System.out.println("********************LinkedList*************************");
		
		//Syntax to Initialize: List<DataType> variable = new LinkedList<DataType>();
		//Syntax to add data: variable.add(value);
		//Syntax to get the data: variable.get(index);
		//Syntax to remove the data:variable.remove(value);
		//Syntax to get the total value : variable.size();
		
		// Order of Storing values:
		// Null Values:
		// Memory allocation:
		
		List<String> empNamesLinkedList = new LinkedList<String>();
		empNamesLinkedList.add("Bharath");
		empNamesLinkedList.add("Dhilip");
		empNamesLinkedList.add("Alekya");
		empNamesLinkedList.add("Aarika");
		empNamesLinkedList.add("Bharath");
		empNamesLinkedList.add(null);
		empNamesLinkedList.remove("Alekya");
		empNamesLinkedList.add(1,"Swapnil");		
		System.out.println("LinkedList Size is : "+empNamesLinkedList.size());
		System.out.println(empNamesLinkedList);
		
		
		

	}

}
