package com.creatio.crm.language.basics;

import java.util.ArrayList;
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
		
		List<Integer> ids = new ArrayList<Integer>();

	}

}
