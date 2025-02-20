package stringOperationsAndDataConversions;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class StringOperations {

	public static void main(String[] args) {

		// Store text value
		String value = " Username : Admin | Password : admin123 ";
		
		
		//Total chars available with in the String ==> String.length();
		System.out.println("Total Chars in String : "+value.length());
		
		//Get Specific char from specific index ==> String.charAt(Index);
		System.out.println("Char at 5th Index :"+value.charAt(5));
		
		//Reverse the String
		String reverseString ="";
		for(int i=value.length()-1;i>=0;i-- ) {
			reverseString=reverseString+value.charAt(i);
		}
		System.out.println(reverseString);
		
		//Remove unwanted spaces from the String ==> String.trim();
		System.out.println("Normal Value :"+value);
		System.out.println("Trimmed Value :"+value.trim());
		
		//Remove all spaces from String ==> String.replace(oldChars, newChars);
		System.out.println("Value without spaces :"+value.replace(" ", ""));
		
		//Remove all alphabets from String ==> String.replaceAll(regExp, newChars);
		System.out.println("Value without alphabets :"+value.replaceAll("[a-zA-Z]", ""));
		
		//Remove all numbers from String ==> String.replaceAll(regExp, newChars);
		System.out.println("Value without alphabets :"+value.replaceAll("[0-9]", ""));
		
		//Remove all special chars from String ==> String.replaceAll(regExp, newChars);
		System.out.println("Value without alphabets :"+value.replaceAll("[^a-zA-Z0-9]", ""));
		
		//Change the case of chars ==>String.toUpperCase(); String.toLowerCase();
		System.out.println(value);	
		System.out.println(value.toUpperCase());	
		System.out.println(value.toLowerCase());	
		
		//Extract the Specific part of the text ==> String.subString(beginingIndex,endIndex);
		System.out.println("Username is:"+value.substring(12,17));
		System.out.println("Password is:"+value.substring(31).trim());
		
		//Extract the Specific part of the text from dynamic String==> String.split(regExp); [] array of Strings
		String [] values = value.split(" ");
		System.out.println("Username is:"+values[3]);
		System.out.println("Password is:"+values[7]);
		
		//Compare text values ==> equals (exact match), equalsIgnoreCase (exact match without case sensitive), contains (partial match), startWith(prefix), endsWith(trailing chars) 
		String name = "Bharath";
		System.out.println(name.equals("bharath"));
		System.out.println(name.equals("Bharath"));
		System.out.println(name.equalsIgnoreCase("bharath"));
		System.out.println(name.contains("hara"));
		System.out.println(name.contains("Hara"));
		System.out.println(name.startsWith("Bha"));
		System.out.println(name.endsWith("ath"));
		
		// How to store text values without using String class
		
		//String ==> immutable class
		//StringBuffer ==> synchronized mutable class
		//StringBuilder ==> non-synchronized mutable class
		
		String empName = "Bharath";
		
		//immutable
		empName.concat(" Reddy");
		System.out.println(empName);
		
		
		//mutable
		StringBuffer sbf = new StringBuffer("Bharath");
		StringBuilder sbd = new StringBuilder("Bharath");
		
		sbf.append(" Reddy");
		sbd.append(" Reddy");
		
		System.out.println(sbf);
		System.out.println(sbd);
		
		// Convert other data types into String values ==> String.valueOf(data);
		int stdCode = 144;
		int phoneNumber = 345678;
		String StdCode = String.valueOf(stdCode);
		System.out.println(StdCode+phoneNumber);
		
		//String to Integer ==> Integer.parseInt(s);Integer.valueOf(s);
		String balance = "   Account Balance :   9999 $";
		balance = balance.replaceAll("[^0-9]", "");
		int Balance = Integer.parseInt(balance);
		
		if(Balance>=10000) {
			System.out.println("Your account is having minimum balance");
		}else {
			System.out.println("Your account is not having minimum balance");
		}
		
		// Converting timestamp into String
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyhhmmss");
		String uniqueId = sdf.format(Calendar.getInstance().getTime());
		System.out.println(uniqueId);
		
		//Type casting
		
		//Primitive type casting
		// byte-->short-->int-->long-->float-->double
		int amount = 1000;
		double Amount = amount; //Auto casting
		
		int amount2 = (int)Amount;
		
		double num = 10.99;
		int Num = (int)num;
		System.out.println(Num);
		double n = Num;
		System.out.println(n);
		
		//Reference type casting
		System.out.println(Calendar.getInstance().getTime());
		
		
		
	}

}
