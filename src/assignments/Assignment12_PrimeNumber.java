package assignments;

public class Assignment12_PrimeNumber {

	public static void main(String[] args) {
		// Prime number is divisible by 1 and itself

		int input = 25;
		boolean prime = true;

		if (input <= 1) {
			System.out.println(input + " is not a prime number"); // prime numbers starts from 2
		}

		for (int i = 2; i < input; i++) {
			if (input % i == 0) {
				prime = false;
			}
		}

		if (prime)
			System.out.println(input + " is  a prime number");
		else
			System.out.println(input + " is not a prime number");

	}

}
