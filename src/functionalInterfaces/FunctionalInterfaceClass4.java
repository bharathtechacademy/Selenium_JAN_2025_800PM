package functionalInterfaces;

public class FunctionalInterfaceClass4 {

	public static void main(String[] args) {
		
		FunctionalInterfaceClass1 fi = (a,b)->a+b;
		System.out.println(fi.sum(2, 7));
	}

}
