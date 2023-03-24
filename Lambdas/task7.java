package Lambdas;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class task7 {
	
	public static void main(String args[]) {
		List<String> countries = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
		Predicate<String> nameStartWithJ=(str)->str.startsWith("J");
		Predicate<String> fourLetterLong = (n) -> n.length() > 4;
		Predicate<String> p=nameStartWithJ.and(fourLetterLong);
		filter(countries,p );
	}

	public static void filter(List<String> names, Predicate<String> condition) {
		names.stream()
		.filter((name) -> (condition.test(name)))
		.forEach((name) -> {
			System.out.println(name + " ");
		});
	}
}
