package functionalInterfaces;

import java.util.Calendar;
import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DefaultFunctionalInterfaces {

	public static void main(String[] args) {
		
		//Predicate ==> predicate (boolean-valued function) of one argument.		
		Predicate<String> isValidPanCard = s -> s.length()==10;
		System.out.println(isValidPanCard.test("BCBPR5454X"));
		
		//Function ==> function that accepts one argument and produces a result.
		Function<Integer,Boolean> isMinBalanceAvailable = x -> x >=10000;
		System.out.println(isMinBalanceAvailable.apply(9999));
		
		//Supplier ==> Supplier won't take any input but return the output
		Supplier<Date> timestamp = () -> Calendar.getInstance().getTime();
		System.out.println(timestamp.get());
		
		//Consumer ==> accepts a single input argument and returns no result
		Consumer<String> message = s -> System.out.println("Hello "+s+", Good Evening !");
		message.accept("Bharathi");

	}

}
