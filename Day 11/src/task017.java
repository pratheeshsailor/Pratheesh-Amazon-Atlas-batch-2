import java.util.*;
import java.util.stream.Collectors;

public class task017 {
    public static void main(String[] args) {

        // Step 1: Create a list with some duplicates
        List<Integer> numbers = Arrays.asList(2, 4, 4, 3, 6, 8, 2, 9, 10, 10);

        // Step 2: Remove duplicates and filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                .distinct()                     // Remove duplicates
                .filter(num -> num % 2 == 0)    // Keep only even numbers
                .collect(Collectors.toList());  // Collect result

        // Step 3: Print result
        System.out.println("Original Numbers: " + numbers);
        System.out.println("Even Numbers (No Duplicates): " + evenNumbers);
    }
}
