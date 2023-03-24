package Lambdas;
import java.util.function.Function;
public class task11 {

    public static void main(String[] args) {

        Function < String, Integer > function1 = (t) -> t.length();

        Integer integer = function1.apply("Ramesh");
        System.out.println(integer);
    }
}

