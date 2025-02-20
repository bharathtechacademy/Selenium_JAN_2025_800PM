package streamsApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsApi3 {

	public static void main(String[] args) {
		List<Integer> input = List.of(1, 2, 2, 3, 4, 3, 5, 6, 3, 7, 8);
		
//		List<Integer> output = new ArrayList<Integer>();
//		
//		for (int i : input) {
//			
//			if(!output.contains(i)) {
//				output.add(i);
//			}
//		}
//		
//		System.out.println(output);
		
		List<Integer> uniqueList = input.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueList);

	}

}
