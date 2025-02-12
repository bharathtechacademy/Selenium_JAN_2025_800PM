package finalNonAccessModifiers;

public class FinalClass1 {
	
	//final can be used before data, method and class
	
	//final data cannot be modified
	//final method can't allow overriding
	//final class won't allow inheritance
	
//	public final String name = "Bharath";
	String name = "Bharath";
	
	final double pie = 3.14;
	
	public void changeName(String newName) {
		name = newName;
	}
	
//	public final void printAddress() {
//		System.out.println("Telangana");
//	}
	
	public void printAddress() {
		System.out.println("Telangana");
	}

	public static void main(String[] args) {

	}

}
