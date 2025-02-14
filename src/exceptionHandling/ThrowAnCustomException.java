package exceptionHandling;

public class ThrowAnCustomException {

	public static void main(String[] args) throws Exception {
		int age = 17;
		
		if (age < 18) {
			throw new Exception("You are not eligible to vote");
		} else {
			System.out.println("You are eligible to vote");
		}

		System.out.println("Execution is completed");
	}

}
