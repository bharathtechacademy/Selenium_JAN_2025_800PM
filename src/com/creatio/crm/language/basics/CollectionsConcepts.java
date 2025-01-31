package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

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
		
		// Order of Storing values:Insertion Order
		// Null Values: Allowed
		// Memory allocation:Contiguous
		
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
		
		// Order of Storing values: Insertion Order
		// Null Values: Allowed
		// Memory allocation: Random
		
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
		
		/**********************HashSet*******************/
		System.out.println("********************HashSet*************************");
		
		//Syntax to Initialize: Set<DataType> variable = new HashSet<DataType>();
		//Syntax to add data: variable.add(value);
		//Syntax to get the data: variable.get(index);
		//Syntax to remove the data:variable.remove(value);
		//Syntax to get the total value : variable.size();
		
		// Order of Storing values: Random Order
		// Null Values: Allowed
		
		Set<String> empNamesHashSet = new HashSet<String>();
		empNamesHashSet.add("Bharath");
		empNamesHashSet.add("Dhilip");
		empNamesHashSet.add("Alekya");
		empNamesHashSet.add("KK");
		empNamesHashSet.add("Vinayak");
		empNamesHashSet.add("Balaji");
		empNamesHashSet.add("Aarika");
		empNamesHashSet.add("Bharath");
		empNamesHashSet.add(null);
		empNamesHashSet.remove("Alekya");
//		empNamesHashSet.add(1,"Swapnil");		
		System.out.println("HashSet Size is : "+empNamesHashSet.size());
		System.out.println(empNamesHashSet);
		
		/**********************LinkedHashSet*******************/
		System.out.println("********************LinkedHashSet*************************");
		
		//Syntax to Initialize: Set<DataType> variable = new LinkedHashSet<DataType>();
		//Syntax to add data: variable.add(value);
		//Syntax to get the data: variable.get(index);
		//Syntax to remove the data:variable.remove(value);
		//Syntax to get the total value : variable.size();
		
		// Order of Storing values: Insertion Order
		// Null Values: Allowed
		
		Set<String> empNamesLinkedHashSet = new LinkedHashSet<String>();
		empNamesLinkedHashSet.add("Bharath");
		empNamesLinkedHashSet.add("Dhilip");
		empNamesLinkedHashSet.add("Alekya");
		empNamesLinkedHashSet.add("KK");
		empNamesLinkedHashSet.add("Vinayak");
		empNamesLinkedHashSet.add("Balaji");
		empNamesLinkedHashSet.add("Aarika");
		empNamesLinkedHashSet.add("Bharath");
		empNamesLinkedHashSet.add(null);
		empNamesLinkedHashSet.remove("Alekya");
//		empNamesLinkedHashSet.add(1,"Swapnil");		
		System.out.println("LinkedHashSet Size is : "+empNamesLinkedHashSet.size());
		System.out.println(empNamesLinkedHashSet);
		
		
		/**********************TreeSet*******************/
		System.out.println("********************TreeSet*************************");
		
		//Syntax to Initialize: Set<DataType> variable = new TreeSet<DataType>();
		//Syntax to add data: variable.add(value);
		//Syntax to get the data: variable.get(index);
		//Syntax to remove the data:variable.remove(value);
		//Syntax to get the total value : variable.size();
		
		// Order of Storing values: Ascending Order
		// Null Values: Not Allowed
		
		Set<String> empNamesTreeSet = new TreeSet<String>();
		empNamesTreeSet.add("Bharath");
		empNamesTreeSet.add("Dhilip");
		empNamesTreeSet.add("Alekya");
		empNamesTreeSet.add("KK");
		empNamesTreeSet.add("Vinayak");
		empNamesTreeSet.add("Balaji");
		empNamesTreeSet.add("Aarika");
		empNamesTreeSet.add("Bharath");
//		empNamesTreeSet.add(null);
		empNamesTreeSet.remove("Alekya");
		System.out.println("TreeSet Size is : "+empNamesTreeSet.size());
		System.out.println(empNamesTreeSet);

		/**********************HashMap*******************/
		System.out.println("********************HashMap*************************");
		
		//Syntax to Initialize: Set<DataType> variable = new HashMap<DataType>();
		//Syntax to add data: variable.add(value);
		//Syntax to get the data: variable.get(index);
		//Syntax to remove the data:variable.remove(value);
		//Syntax to get the total value : variable.size();
		
		// Order of Storing values: Random Order
		// Null Keys: Allowed
		// Null Values: Allowed
		
		Map<String,Integer> empNamesHashMap = new HashMap<String,Integer>();
		empNamesHashMap.put("Bharath",1);
		empNamesHashMap.put("Dhilip",2);
		empNamesHashMap.put("Alekya",3);
		empNamesHashMap.put("KK",2);
		empNamesHashMap.put("Vinayak",5);
		empNamesHashMap.put("Balaji",6);
		empNamesHashMap.put("Aarika",7);
		empNamesHashMap.put("Bharath",8);
		empNamesHashMap.put("Swapnil",null);
		empNamesHashMap.put(null,10);
		empNamesHashMap.remove("Alekya");
		System.out.println("HashMap Size is : "+empNamesHashMap.size());
		System.out.println(empNamesHashMap);
		
		/**********************LinkedHashMap*******************/
		System.out.println("********************LinkedHashMap*************************");
		
		//Syntax to Initialize: Set<DataType> variable = new LinkedHashMap<DataType>();
		//Syntax to add data: variable.add(value);
		//Syntax to get the data: variable.get(index);
		//Syntax to remove the data:variable.remove(value);
		//Syntax to get the total value : variable.size();
		
		// Order of Storing values: Insertion Order
		// Null Keys: Allowed
		// Null Values: Allowed
		
		Map<String,Integer> empNamesLinkedHashMap = new LinkedHashMap<String,Integer>();
		empNamesLinkedHashMap.put("Bharath",1);
		empNamesLinkedHashMap.put("Dhilip",2);
		empNamesLinkedHashMap.put("Alekya",3);
		empNamesLinkedHashMap.put("KK",2);
		empNamesLinkedHashMap.put("Vinayak",5);
		empNamesLinkedHashMap.put("Balaji",6);
		empNamesLinkedHashMap.put("Aarika",7);
		empNamesLinkedHashMap.put("Bharath",8);
		empNamesLinkedHashMap.put("Swapnil",null);
		empNamesLinkedHashMap.put(null,10);
		empNamesLinkedHashMap.remove("Alekya");
		System.out.println("LinkedHashMap Size is : "+empNamesLinkedHashMap.size());
		System.out.println(empNamesLinkedHashMap);
		
		/**********************TreeMap*******************/
		System.out.println("********************TreeMap*************************");
		
		//Syntax to Initialize: Map<Key,Value> variable = new TreeMap<Key,Value>();
		//Syntax to add data: variable.add(value);
		//Syntax to get the data: variable.get(index);
		//Syntax to remove the data:variable.remove(value);
		//Syntax to get the total value : variable.size();
		
		// Order of Storing values: Ascending Order
		// Null Keys: Not Allowed
		// Null Values: Allowed
		
		Map<String,Integer> empNamesTreeMap = new TreeMap<String,Integer>();
		empNamesTreeMap.put("Bharath",1);
		empNamesTreeMap.put("Dhilip",2);
		empNamesTreeMap.put("Alekya",3);
		empNamesTreeMap.put("KK",2);
		empNamesTreeMap.put("Vinayak",5);
		empNamesTreeMap.put("Balaji",6);
		empNamesTreeMap.put("Aarika",7);
		empNamesTreeMap.put("Bharath",8);
		empNamesTreeMap.put("Swapnil",null);
//		empNamesTreeMap.put(null,10);
		empNamesTreeMap.remove("Alekya");
		System.out.println("TreeMap Size is : "+empNamesTreeMap.size());
		System.out.println(empNamesTreeMap);
		
		/**********************Hashtable*******************/
		System.out.println("********************Hashtable*************************");
		
		//Syntax to Initialize: Map<Key,Value> variable = new Hashtable<Key,Value>();
		//Syntax to add data: variable.add(value);
		//Syntax to get the data: variable.get(index);
		//Syntax to remove the data:variable.remove(value);
		//Syntax to get the total value : variable.size();
		
		// Order of Storing values: R Order
		// Null Keys: Not Allowed
		// Null Values:Not Allowed
		
		Map<String,Integer> empNamesHashtable = new Hashtable<String,Integer>();
		empNamesHashtable.put("Bharath",1);
		empNamesHashtable.put("Dhilip",2);
		empNamesHashtable.put("Alekya",3);
		empNamesHashtable.put("KK",2);
		empNamesHashtable.put("Vinayak",5);
		empNamesHashtable.put("Balaji",6);
		empNamesHashtable.put("Aarika",7);
		empNamesHashtable.put("Bharath",8);
//		empNamesHashtable.put("Swapnil",null);
//		empNamesHashtable.put(null,10);
		empNamesHashtable.remove("Alekya");
		System.out.println("Hashtable Size is : "+empNamesHashtable.size());
		System.out.println(empNamesHashtable);

		Map<String,String> row1 = new HashMap<String,String>();
		row1.put("Username", "Swapnil");
		row1.put("Password", "Swapnil123");
		row1.put("SecretCode", "SecretCode1234");
		
		Map<String,String> row2 = new HashMap<String,String>();
		row1.put("Username", "Balaji");
		row1.put("Password", "Balaji123");
		row1.put("SecretCode", "BalajiSecretCode1234");
		
		List<Map<String,String>> data = new ArrayList<Map<String,String>>();
		data.add(row1);
		data.add(row2);
		
		data.get(1).get("Password");

	}

}
