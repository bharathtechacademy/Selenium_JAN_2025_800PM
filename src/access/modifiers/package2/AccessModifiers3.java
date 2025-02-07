package access.modifiers.package2;

import access.modifiers.package1.AccessModifiers1;

public class AccessModifiers3 extends AccessModifiers1{

	public static void main(String[] args) {
		AccessModifiers1 obj = new AccessModifiers1();
		System.out.println(obj.name);
		obj.printEmpId();
//		System.out.println(obj.getName());
//		obj.setNewName("Bharathi");
	}

}
