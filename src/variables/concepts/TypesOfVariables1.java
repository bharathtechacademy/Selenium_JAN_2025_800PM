package variables.concepts;

public class TypesOfVariables1 {
	
	String topic2 = "Database"; //Instance Variable 	
	
	static String topic3 = "Java"; //Global Variable

	public static void main(String[] args) {		
		String topic1 = "Selenium"; // Local Variable
		System.out.println(topic1);
	}
	
	public void main2(String[] args) {
		System.out.println(topic3);
//		System.out.println(topic1);
	}



}
