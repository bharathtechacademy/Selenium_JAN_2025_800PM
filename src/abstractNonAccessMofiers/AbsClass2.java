package abstractNonAccessMofiers;

public class AbsClass2 extends AbsClass1{

	public static void main(String[] args) {
		
//		AbsClass1 obj = new AbsClass1();
//		obj.printName();

	}

	@Override
	public void printEmpNameAndId(String empName, int empId) {
		System.out.println(empName);
		System.out.println(empId);
	}

}
