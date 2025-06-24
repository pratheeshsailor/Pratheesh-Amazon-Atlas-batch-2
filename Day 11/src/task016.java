import java.util.*;
import java.util.stream.Collectors;

public class task016 {
    public static void main(String[] args) {

        // Step 1: Create a list of 5 integers
        List<Integer> numbers = Arrays.asList(2, 3, 5, 8, 9);

        // Step 2: Filter only odd numbers using stream
        List<Integer> oddNumbers = numbers.stream()
                .filter(num -> num % 2 != 0)
                .collect(Collectors.toList());

        // Step 3: Print results
        System.out.println("Original Numbers: " + numbers);
        System.out.println("Odd Numbers: " + oddNumbers);
    }
}
