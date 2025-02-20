package streamsApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsAPI {
	
	// {1,2,3,4,5,6,7,8};

	public static void main(String[] args) {
		List<Integer> input = List.of(1,2,3,4,5,6,7,8);		
		
//		List<Integer> output = new ArrayList<Integer>();		
//		for(int i : input) {
//			
//			if(i%2==0) {
//				output.add(i);
//			}
//		}
//		
//		System.out.println(output);
		
		List<Integer> evenNumbers = input.stream().filter(n -> n%2==0).collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		
		
	}

}
