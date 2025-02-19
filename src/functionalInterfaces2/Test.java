package functionalInterfaces2;

import java.util.function.Function;

public class Test {

	public static void main(String[] args) {
		
		Function<String,String> cube = a -> "Mr "+a;
		System.out.println(cube.apply("Bharath Reddy"));
//		
//		Test obj = new Test();
//		System.out.println(obj.cube(3));

	}

	
//	public int cube(int x) {
//		int y = x*x*x;
//		return x;
//	}
}
