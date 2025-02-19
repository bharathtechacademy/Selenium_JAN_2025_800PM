package functionalInterfaces;

import java.util.function.BiFunction;

public class FunctionalInterfaceClass5 {

	public static void main(String[] args) {
		
		BiFunction<Integer, Integer,Integer > sum = (a,b) -> a+b;
		System.out.println(sum.apply(2, 7));

	}

}
