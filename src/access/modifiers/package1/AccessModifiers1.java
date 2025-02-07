package access.modifiers.package1;

public class AccessModifiers1 {
	
	public String name = "Lavanya";
	
	public void printEmpId() {
		System.out.println(1234);
	}

	public static void main(String[] args) {
		AccessModifiers1 obj = new AccessModifiers1();
		System.out.println(obj.name);
		obj.printEmpId();
	}

	public String getName() {
		return name;
	}
	
	public void setNewName(String newName) {
		name =newName;
		System.out.println(name);
	}
}
