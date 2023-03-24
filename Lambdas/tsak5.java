package Lambdas;
import java.util.Arrays;
import java.util.List;

public class tsak5 {
	public static void main(String args[]) {   
		List<String> countries=Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada"); 
		countries.forEach(c -> System.out.println(c));
	}
}
