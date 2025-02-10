package nonAccessModifiers;

public class NonAccessModifiers {
	
	// 1.static
	// 2.abstract
	// 3.final
	// 4.synchronized
	// 5. volatile
	// 6. transient 
	
	//It's mandatory to use access modifiers before non-access modifiers
	
	//static non-access modifier
	
	//static can be used before data as well as methods/block
	
	static String name = "Bharath Reddy";
	
	public static void printEmpId() {
		System.out.println(1234);
	}

	public static void main(String[] args) {		
		NonAccessModifiers obj = new NonAccessModifiers();
		System.out.println(name);
		printEmpId();
	}

}
