package assignments;

public class Assignment3_EmpGroups {

	public static void main(String[] args) {
		Employees obj = new Employees();
		String[] employeeNames = { obj.employeeName1, obj.employeeName2, obj.employeeName3 };
		int[] employeeIDs = { obj.employeeID1, obj.employeeID2, obj.employeeID3 };

		System.out.println(employeeNames[0] + " : " + employeeIDs[0]);

	}

}
