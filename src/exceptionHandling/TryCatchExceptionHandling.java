package exceptionHandling;

public class TryCatchExceptionHandling {

	public static void main(String[] args) {

		try {
			int a = 10;
			int b = 0;
			int result = a / b;
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("There is an exception in above program");
			int a = 20;
			int b = 0;
			int result = a / b;
			System.out.println(result);
		} finally {
			System.out.println("Execution Completed");
		}

	}

}
