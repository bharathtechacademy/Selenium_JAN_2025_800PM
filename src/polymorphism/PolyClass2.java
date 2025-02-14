package polymorphism;

public class PolyClass2 extends PolyClass1{

	//overriding
	public int sumOfNumbers(int a, int b) {
		int c = a + b;
		return c;
	}
	
	//overloading
	public int sumOfNumbers(int a, int b, int c) {
		int d = a + b + c;
		return d;
	}

	public static void main(String[] args) {
		PolyClass2 obj = new PolyClass2();
		System.out.println(obj.sumOfNumbers(1, 2));
		
		System.out.println("Bharath Reddy");
		System.out.println(1234);
		System.out.println(true);
		System.out.println('A');

		
	}

}
