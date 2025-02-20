package streamsApi;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsAPI4 {

	public static void main(String[] args) {
		List<Integer> input = List.of(11,2,3,14,5,6,1,7,18);	
		
		List<Integer> sortedList = input.stream().sorted().collect(Collectors.toList());
		List<Integer> reverseOrderList = input.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
				
		System.out.println(sortedList);
		System.out.println(reverseOrderList);

	}

}
