package finalNonAccessModifiers;

public class FinalClass2 extends FinalClass1{
	
	public void printAddress() {
		System.out.println("Hyderabad");
	}

	public static void main(String[] args) {
		FinalClass2 obj = new FinalClass2();
		System.out.println(obj.name);
		obj.changeName("Bharath Reddy");
		System.out.println(obj.name);
		obj.printAddress();
	}

}
