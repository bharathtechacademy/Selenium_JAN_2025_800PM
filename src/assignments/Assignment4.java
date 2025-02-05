package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Assignment4 {

	public static void main(String[] args) {
		
		//Below Employee1Map details are stored using Map(HashMap) 
		
		Map<String,String > Employee1Map = new HashMap<String,String>();
		Employee1Map.put("Employee ID","E001");
		Employee1Map.put("Name","Alice Green");
		Employee1Map.put("Age","30");
		Employee1Map.put("Gender","Female");
		Employee1Map.put("Department","Engineering");
		Employee1Map.put("Position","Software Engineer");
		Employee1Map.put("Salary","75,000");
		Employee1Map.put("Email","alice@example.com");
		Employee1Map.put("Contact Number","9876543213");
		System.out.println("Employee 1 details :"+Employee1Map);
		
		//Below Employee2Map details are stored using Map(HashMap) 
		
		Map<String,String > Employee2Map = new HashMap<String,String>();
		Employee2Map.put("Employee ID","E002");
		Employee2Map.put("Name","Bob Johnson");
		Employee2Map.put("Age","35");
		Employee2Map.put("Gender","Male");
		Employee2Map.put("Department","Marketing");
		Employee2Map.put("Position","Marketing Manager");
		Employee2Map.put("Salary","85,000");
		Employee2Map.put("Email","bob@example.com");
		Employee2Map.put("Contact Number","9876543214");
		System.out.println("Employee 2 details :"+Employee2Map);
		
		//Below Employee3Map details are stored using Map(HashMap) 
		
		Map<String,String > Employee3Map = new HashMap<String,String>();
		Employee3Map.put("Employee ID","E003");
		Employee3Map.put("Name","Carol White");
		Employee3Map.put("Age","28");
		Employee3Map.put("Gender","Female");
		Employee3Map.put("Department","Sales");
		Employee3Map.put("Position","Sales Executive");
		Employee3Map.put("Salary","65,000");
		Employee3Map.put("Email","carol@example.com");
		Employee3Map.put("Contact Number","9876543215");
		System.out.println("Employee 3 details :"+Employee3Map);
		
			
		//Employee1Map,Employee2Map,Employee3Map details are added under List (empList)
		
		List<Map<String,String >> empList = new ArrayList<Map<String,String >>();
		empList.add(Employee1Map);
		empList.add(Employee2Map);
		empList.add(Employee3Map);
		System.out.println("Employee List :"+empList);
		
	
		System.out.println("Email of 2nd row Employee Data: "+empList.get(1).get("Email"));
			

	}

}
