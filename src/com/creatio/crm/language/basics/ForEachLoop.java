package com.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ForEachLoop {

	// for each loop ==> extended for loop ==> It will be used to iterate multiple
	// values available in pre-defined list
	
//	for( datatype variable: list) {
//		
//	}

	public static void main(String[] args) {

		int[] empIds = new int[3];
		empIds[0] = 1234;
		empIds[1] = 1235;
		empIds[2] = 1236;
		
//		for(int i=0 ;i<empIds.length ; i++) {
//			System.out.println(empIds[i]);
//		}
		
		for(int value : empIds) {
			System.out.println(value);
		}

		List<String> empNamesArrayList = new ArrayList<String>();
		empNamesArrayList.add("Bharath");
		empNamesArrayList.add("Dhilip");
		empNamesArrayList.add("Alekya");
		empNamesArrayList.add("Aarika");
		empNamesArrayList.add("Bharath");
		empNamesArrayList.add(null);
		empNamesArrayList.remove("Alekya");
		empNamesArrayList.add(1, "Swapnil");
		
//		for(int i=0 ;i<empNamesArrayList.size() ; i++) {
//			System.out.println(empNamesArrayList.get(i));
//		}
		
		for(String value : empNamesArrayList) {
			System.out.println(value);
		}
		
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
		
//		for(int i=0 ;i<empNamesHashSet.size() ; i++) {
//			System.out.println(empNamesHashSet.get(i));
//		}
		
		for(String value : empNamesHashSet) {
			System.out.println(value);
		}

	}

}
