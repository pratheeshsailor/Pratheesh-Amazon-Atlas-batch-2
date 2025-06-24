// ReverseStringLambda
import java.util.function.Function;

public class  task010{
    public static void main(String[] args) {
        String input = "lambda";

        // Lambda to reverse a string
        Function<String, String> reverse = str -> new StringBuilder(str).reverse().toString();

        String reversed = reverse.apply(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
}
