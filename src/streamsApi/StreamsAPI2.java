package streamsApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsAPI2 {

	public static void main(String[] args) {
		List<Integer> input = List.of(1,2,3,4,5,6,7,8);	
		
//		List<Integer> output = new ArrayList<Integer>();	
//		
//		for(int i : input) {
//			
//			int j = i*i ;
//			
//			output.add(j);
//		}
//		
//		System.out.println(output);
		
		List<Integer> squareList = 	input.stream().map(n -> n*n).collect(Collectors.toList());
		System.out.println(squareList);

	}

}
