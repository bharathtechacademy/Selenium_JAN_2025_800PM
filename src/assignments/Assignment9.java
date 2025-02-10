package assignments;

public class Assignment9 {

	public static void main(String args[]) {
		int[] array = { 12, 34, 11, 36, 87, 98, 93 };
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}

		}
		System.out.println("Second largest number is :" + array[1]);
		System.out.println("Third largest number is :" + array[2]);
	}

}
