import java.util.*;
import java.util.stream.Collectors;

public class task015 {
    public static void main(String[] args) {

        // Step 1: Create a list of 5 integers
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);

        // Step 2: Use stream to square each number and collect
        List<Integer> squareOfNums = numbers.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());

        // Step 3: Print results
        System.out.println("Original Numbers: " + numbers);
        System.out.println("Squares: " + squareOfNums);
    }
}
